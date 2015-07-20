/**
 * @author mao.instantlife at gmail.com
 */
object LoadingRepository {

  // TODO 仮
  var loadings: List[Loading] = List()

  def nowLoadings: List[Loading] = loadings

  def nextLoadingId: Int = loadings.length + 1
}
