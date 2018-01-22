package edu.knoldus.application

import edu.knoldus.operation.{ClientSideCommission, Commission, StreetSideCommission, TotalCommission}
import org.apache.log4j.Logger


object ApplicationObject extends App {

  val logger = Logger.getLogger(this.getClass)


  val commission1 = 100
  val commission2 = 200
  val commission3 = 300
  val commission4 = 400
  val streetSideCommissionObject = StreetSideCommission(commission1)
  val streetSideCommissionObjectTwo = StreetSideCommission(commission2)
  val clientSideCommissionObject = ClientSideCommission(commission3)
  val clientSideCommissionObjectTwo = ClientSideCommission(commission4)
  val streetSideCommissionList = List(streetSideCommissionObject, streetSideCommissionObjectTwo)
  val clientSideCommissionList = List(clientSideCommissionObject, clientSideCommissionObjectTwo)
  val commissionListTwo = List(streetSideCommissionObject, streetSideCommissionObjectTwo,
    clientSideCommissionObject, clientSideCommissionObjectTwo)
  val totalCommission = new TotalCommission
  logger.info(s"${totalCommission.getTotalCommission(streetSideCommissionList)}\n")
  logger.info(s"\n${totalCommission.getTotalCommission(clientSideCommissionList)}\n")
  logger.info(s"\n${totalCommission.getTotalCommission[Commission](commissionListTwo)}\n")

}
