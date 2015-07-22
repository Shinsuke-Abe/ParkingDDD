/**
 * @author mao.instantlife at gmail.com
 */

import java.util.{Calendar, Date}

import org.specs2.mutable._

class LoadingSpec extends Specification {
  "入出庫データの作成" >> {
    val loadingDate = new Date
    val target = LoadingFactory.create(loadingDate)

    target.id must equalTo(LoadingRepository.nextLoadingId)
    target.loadingDate must equalTo(loadingDate)
    target.unloadingDate must beNull
  }

  "入庫ルール" >> {
    "入庫中の数が上限を下回っているときはtrue" >> {
      LoadingRule.isLoadable(1, 10) must beTrue
    }

    "入庫中の数が上限と同じときはfalse" >> {
      LoadingRule.isLoadable(10, 10) must beFalse
    }

    "入庫中の数が上限を上回ったときはfalse" >> {
      // 実際はあり得ない
      LoadingRule.isLoadable(11, 10) must beFalse
    }
  }

  "料金計算をする" >> {
    "出庫時間がある場合は料金を算出する" >> {
      val loadingDate = new Date

      val cal = Calendar.getInstance
      cal.setTime(loadingDate)
      cal.add(Calendar.HOUR, 1)

      val unloadingDate = cal.getTime

      var target = LoadingFactory.create(loadingDate)
      target.unloadingDate = unloadingDate

      target.calculate must equalTo(100)
    }
    // TODO 出庫時間がない場合はエラーにする
  }
}
