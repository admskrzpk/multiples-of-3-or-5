object MultiplesEuler extends App {

  def multiplesEuler(boarder: Int): Int = {
    (1 until boarder).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }
}