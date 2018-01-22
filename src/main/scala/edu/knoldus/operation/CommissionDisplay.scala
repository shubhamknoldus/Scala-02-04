package edu.knoldus.operation

import scala.reflect.runtime.universe._

sealed trait CommissionDisplay {
  def totalDisplayCommission: String
}


object TotalCom {

  implicit def calculate[T <: Commission : TypeTag](commissionList: List[T]): String = {
    typeOf[List[T]] match {
      case typeOfList if typeOfList =:= typeOf[List[ClientSideCommission]] => s"the total client side commission is ${commissionList.map(_.value).sum}"
      case typeOfList if typeOfList =:= typeOf[List[StreetSideCommission]] => s"the total street side commission is ${commissionList.map(_.value).sum}"
      case typeOfList if typeOfList =:= typeOf[List[Commission]] => s"the total mingled commission is ${commissionList.map(_.value).sum}"
    }
  }

  implicit class DisplayCommission[T <: Commission : TypeTag](commissionList: List[T]) extends CommissionDisplay {
    override def totalDisplayCommission: String = {
      commissionList
    }
  }

}
