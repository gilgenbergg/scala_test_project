import org.scalatest.FunSuite

class FiboTest extends FunSuite{

  val testFibo = new Fibo()

  test("FiboWithWhile_0") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(0) === 0)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (zero item):" + duration)
  }

  test("FiboWithRec_0") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(0) === 0)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (zero item):" + duration)
  }

  test("FiboWithWithTailRec_0") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(0) === 0)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (zero item):" + duration)
  }

  test("FiboWithWhile_1") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(1) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (first item):" + duration)
  }

  test("FiboWithRec_1") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(1) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (first item):" + duration)
  }

  test("FiboWithWithTailRec_1") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(1) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (first item):" + duration)
  }

  test("FiboWithWhile_2") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(2) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (second item):" + duration)
  }

  test("FiboWithRec_2") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(2) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (second item):" + duration)
  }

  test("FiboWithWithTailRec_2") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(2) === 1)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (second item):" + duration)
  }

  test("FiboWithWhile_3") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(3) === 2)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (third item):" + duration)
  }

  test("FiboWithRec_3") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(3) === 2)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (third item):" + duration)
  }

  test("FiboWithWithTailRec_3") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(3) === 2)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (third item):" + duration)
  }

  test("FiboWithWhile_10") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(10) === 55)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (tenth item):" + duration)
  }

  test("FiboWithRec_10") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(10) === 55)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (tenth item):" + duration)
  }

  test("FiboWithWithTailRec_10") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(10) === 55)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (tenth item):" + duration)
  }

  test("FiboWithWhile_22") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(22) === 17711)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (twenty-second item):" + duration)
  }

  test("FiboWithRec_22") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(22) === 17711)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (twenty-second item):" + duration)
  }

  test("FiboWithWithTailRec_22") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(22) === 17711)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (twenty-second item):" + duration)
  }

  test("FiboWithWhile_40") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(40) === 102334155)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with while (twenty-second item):" + duration)
  }

  test("FiboWithRec_40") {
    val t1 = System.nanoTime
    assert(testFibo.withWhile(40) === 102334155)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with recursion (twenty-second item):" + duration)
  }

  test("FiboWithWithTailRec_40") {
    val t1 = System.nanoTime
    assert(testFibo.withTailRec(40) === 102334155)
    val duration = (System.nanoTime - t1) / 1e9d
    println("Time with tailRec (twenty-second item):" + duration)
  }

}
