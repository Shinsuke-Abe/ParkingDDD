import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
case class Loading(id: Int, loadingDate: Date) {
  var unloadingDate: Date = null

  def calculate = 100
}
