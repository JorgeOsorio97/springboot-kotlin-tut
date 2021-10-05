package ml.jorgevaldez.springboottutorial.service

import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import ml.jorgevaldez.springboottutorial.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val datasource: BankDataSource) {
    fun getBanks(): Collection<Bank> = datasource.retrieveBanks()
}