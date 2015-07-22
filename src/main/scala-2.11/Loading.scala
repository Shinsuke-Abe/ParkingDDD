import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
case class Loading(id: Int, loadingDate: Date) {
  var unloadingDate: Date = null

  def calculate = 100
}

object LoadingFactory {
  def create(loadingDate: Date): Loading = {
    new Loading(LoadingRepository.nextLoadingId, loadingDate)
  }
}

object LoadingRepository {
  // TODO 仮
  var loadings: List[Loading] = List()

  def nowLoadings: List[Loading] = loadings

  def nextLoadingId: Int = loadings.length + 1

  def findById(id: Int): Loading = new Loading(id, new Date)
}