package ml.jorgevaldez.springboottutorial.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest{

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`(){
        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}