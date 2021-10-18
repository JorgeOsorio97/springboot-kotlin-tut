package ml.jorgevaldez.springboottutorial.service

import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import ml.jorgevaldez.springboottutorial.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val datasource: BankDataSource) {
    fun getBanks(): Collection<Bank> = datasource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = datasource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank =datasource.createBank(bank)
    fun updateBank(bank: Bank): Bank = datasource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = datasource.deleteBank(accountNumber)
}