/**
 * Класс для запуска тестов
 * Автор Васильев И.Н. atcc@mail.ru
 * 02.12.2018
 */
package ru.lanit.atschool;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"ru.lanit.atschool.steps"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
