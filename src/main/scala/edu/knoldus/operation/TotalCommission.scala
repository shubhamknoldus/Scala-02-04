package edu.knoldus.operation

import edu.knoldus.operation.TotalCom._

import scala.reflect.runtime.universe._

class TotalCommission {
  def getTotalCommission[T <: Commission : TypeTag](totalCommissionList: List[T]): String = {
    totalCommissionList.totalDisplayCommission
  }
}
