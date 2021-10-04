package ml.jorgevaldez.springboottutorial.datasource.mock

import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import ml.jorgevaldez.springboottutorial.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks =  listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("1234", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}