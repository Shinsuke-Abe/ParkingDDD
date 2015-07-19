/**
 * @author mao.instantlife at gmail.com
 */

import java.util.{Calendar, Date}

import org.specs2.mutable._

class LoadingSpec extends Specification {
  "入出庫データの作成" >> {
    "入庫可能な場合に入出庫を作成する" >> {
      val loadingDate = new Date
      val target = LoadingFactory.create(loadingDate)

      target.id must equalTo(1)
      target.loadingDate must equalTo(loadingDate)
      target.unloadingDate must beNull
    }
    // TODO 入庫不可能な場合入出庫作成
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
