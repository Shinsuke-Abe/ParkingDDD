import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
object LoadingFactory {
  def create(loadingDate: Date): Loading = {
    new Loading(1, loadingDate)
  }
}
