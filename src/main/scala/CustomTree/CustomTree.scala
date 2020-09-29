package CustomTree

class CustomTree {

  case class DeepPoint(point: Point, level: Int)

  def sortNodes(parented: Seq[Point], groupedByParents: Map[String, Seq[Point]]): Seq[DeepPoint] =
    calcDepth(0, parented, groupedByParents, Seq.empty)

  def calcDepth(level: Int, parented: Seq[Point], groupedByParents: Map[String, Seq[Point]],
                accumulator: Seq[DeepPoint]): Seq[DeepPoint] = {
    val deeped = parented.map(n => DeepPoint(n, level))
    val resultNodes = deeped ++ accumulator
    val ancs = parented.flatMap(n => groupedByParents.getOrElse(n.id, Seq.empty))
    if (ancs.isEmpty) {
      resultNodes
    }
    else
      calcDepth(level + 1, ancs, groupedByParents, resultNodes)
  }

  def createTree(maxLevel: Int, sorted: Seq[DeepPoint], groupedByParents: Map[String, Seq[Point]],
                 resultNodes: Map[String, Node]): Seq[Node] = {
    val (current, next) = sorted.span(_.level == maxLevel)
    val toProcess = current.map { n =>
      val pointID = n.point.id
      val ancs = groupedByParents.getOrElse(pointID, Seq.empty).flatMap(
        a => resultNodes.get(a.id)
      )
      pointID -> Node(n.point, ancs)
    }.toMap
    if (maxLevel > 0) {
      createTree(maxLevel - 1, next, groupedByParents, resultNodes ++ toProcess)
    }
    else {
      toProcess.values.toSeq
    }
  }

  def defineTree(points: Seq[Point]): (Seq[Node], Int) = {
    val groupedByParents = points.groupBy(_.parentId)
    val parented = groupedByParents.getOrElse("", Seq.empty)
    val sorted = sortNodes(parented, groupedByParents)
    val maxLevel = sorted.headOption.map(_.level).getOrElse(0)
    (createTree(maxLevel, sorted, groupedByParents, Map.empty), maxLevel)
  }
}
