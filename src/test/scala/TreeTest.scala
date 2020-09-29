import CustomTree.{CustomTree, Point}
import org.scalatest.FunSuite

class TreeTest extends FunSuite {
  val testTree = new CustomTree()

  test("TestEmptyTreeBuilt") {
    val points = Seq()
    assert(testTree.defineTree(points) === (List(),0))
  }

  // tree with no root
  test("TestInvalidTree") {
    val points = Seq(
      Point("2", "1"),
      Point("3","1")
    )
    val (tree, maxLevel) = testTree.defineTree(points)
    assert(tree === Nil)
  }

  test("TestTreeBuilt") {
    val points = Seq(
      Point("2", "1"),
      Point("3","1"),
      Point("1", ""),
      Point("5", "2"),
      Point("4", "2"),
      Point("6", "2")
    )
    // expected output
    // val expectedTree = (List(Node(Point("1",""),List(Node(Point("2","1"),List(Node(Point("5","2"),List()),
    //  Node(Point("4","2"),List()), Node(Point(6,2),List()))), Node(Point("3","1"),List())))),"2")
    print(testTree.defineTree(points))
  }

  // level starts from 0, incrementing from top to bottom (according to level of parent)
  test("TestMaxDepth") {
    val points = Seq(
      Point("2", "1"),
      Point("3","1"),
      Point("1", ""),
      Point("5", "2"),
      Point("4", "2")
    )
    val (tree, maxLevel) = testTree.defineTree(points)
    assert(maxLevel === 2)
  }
}
