package org.selenide.exemplos.paginas;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;


public class desafioTecnicoPage {



    public desafioTecnicoPage navegar() throws InterruptedException{
        open("http://sampleapp.tricentis.com/101/app.php");
        return this;
    }

    public void selecionarCampoMake() {
        $(By.id("make")).shouldBe(visible).selectOption("Audi");
    }

    public void selecionarCampoModel() {
        $(By.id("model")).shouldBe(visible).selectOption("Scooter");
    }

    public void preencherCampoCylinderCapacity(){
        $(By.id("cylindercapacity")).shouldBe(visible).sendKeys("500");
    }

    public void preencherCampoEnginePerformance(){
        $(By.id("engineperformance")).shouldBe(visible).sendKeys("123");
    }

    public void preencherCampoDateOfManufacture(){
        $(By.id("dateofmanufacture")).shouldBe(visible).sendKeys("08/02/2022");
    }

    public void preencherCampoNumberOfSeats(){
        $(By.id("numberofseats")).shouldBe(visible).selectOption("1");
    }

    public void clicarCheckBox(){
        $(By.className("ideal-radiocheck-label")).shouldBe(visible).click();
    }

    public void selecionarCampoNumberOfSeats(){
        $(By.id("numberofseatsmotorcycle")).shouldBe(visible).selectOption("1");
    }

    public void selecionarCamoFuelType(){
        $(By.id("fuel")).shouldBe(visible).selectOption("Petrol");
    }

    public void preencherCampoPayload(){
        $(By.id("payload")).shouldBe(visible).sendKeys("500");
    }

    public void preencherCampoTotalWeight(){
        $(By.id("totalweight")).shouldBe(visible).sendKeys("500");
    }

    public void preencherCampoListPrice(){
        $(By.id("listprice")).shouldBe(visible).sendKeys("500");
    }

    public void preencherCampoLicensePlateNumber(){
        $(By.id("licenseplatenumber")).shouldBe(visible).sendKeys("Teste");
    }

    public void preencherCampoAnnualMileage(){
        $(By.id("annualmileage")).shouldBe(visible).sendKeys("2200");
    }

    public void clicarBotaoNext() {
        $(By.id("nextenterinsurantdata")).shouldBe(visible).click();
    }

    public void clicarBotaoNext2() {
        $(By.id("nextenterproductdata")).shouldBe(visible).click();
    }

    public void clicarBotaoNext3() {
        $(By.id("nextselectpriceoption")).shouldBe(visible).click();
    }

    public void clicarBotaoNext4() {
        $(By.id("nextsendquote")).shouldBe(visible).click();
    }


    public void preencherCampoFirstName(){
        $(By.id("firstname")).shouldBe(visible).sendKeys("Bianca");
    }

    public void preencherCampoLastName(){
        $(By.id("lastname")).shouldBe(visible).sendKeys("Lins");
    }

    public void preencherCampoDateOfBirth(){
        $(By.id("birthdate")).shouldBe(visible).sendKeys("10/11/1994");
    }

    public void clicarCheckBoxGender(){
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[2]")).shouldBe(visible).click();
    }

    public void preencherCampoStreetAddress(){
        $(By.id("streetaddress")).shouldBe(visible).sendKeys("Rua General Porfirio da Paz");
    }

    public void selecionarCampoCountry(){
        $(By.id("country")).shouldBe(visible).selectOption("Brazil");
    }

    public void preencherCampoZipCode(){
        $(By.id("zipcode")).shouldBe(visible).sendKeys("03918000");
    }

    public void preencherCampoCity(){
        $(By.id("city")).shouldBe(visible).sendKeys("10/11/1994");
    }

    public void selecionarCampoOccupation(){
        $(By.id("occupation")).shouldBe(visible).selectOption("Employee");
    }

    public void selecionarCheckBoxHobbies(){
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[1]")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[2]")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[3]")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[5]")).shouldBe(visible).click();
    }

    public void preencherCampoStartDate(){
        $(By.id("startdate")).shouldBe(visible).sendKeys("10/10/2022");
    }

    public void selecionarCampoInsuranceSum(){
        $(By.id("insurancesum")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurancesum']/option[10]")).shouldBe(visible).click();
    }

    public void selecionarCampoMeritRating(){
        $(By.id("meritrating")).shouldBe(visible).selectOption("Malus 14");
    }

    public void selecionarCampoDamageInsurance(){
        $(By.id("damageinsurance")).shouldBe(visible).selectOption("Full Coverage");
    }

    public void clicarCheckBoxOptionalProducts(){
        $(By.xpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]")).shouldBe(visible).click();
        $(By.xpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[2]")).shouldBe(visible).click();
    }

    public void selecionarCampoCourtesyCar(){
        $(By.id("courtesycar")).shouldBe(visible).selectOption("Yes");
    }

    public void clicarCheckBoxUltimate(){
        $(By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]")).shouldBe(visible).click();
    }

    public void preencherCampoEmail(){
        $(By.id("email")).shouldBe(visible).sendKeys("bb.lins.14@gmail.com");
    }

    public void preencherCampoPhone(){
        $(By.id("phone")).shouldBe(visible).sendKeys("61996856038");
    }

    public void preencherCampoUsername(){
        $(By.id("username")).shouldBe(visible).sendKeys("bianca.lins");
    }

    public void preencherCampoPassword(){
        $(By.id("password")).shouldBe(visible).sendKeys("Desafioaccentury2022");
    }

    public void preencherCampoConfirmPassword(){
        $(By.id("confirmpassword")).shouldBe(visible).sendKeys("Desafioaccentury2022");
    }

    public void preencherCampoComments(){
        $(By.id("Comments")).shouldBe(visible).sendKeys("Teste accentury 2022");
    }

    public void clicarBotaoSend(){
        $(By.id("sendemail")).shouldBe(visible).click();
    }

    public String mensagemSucesso(String msg){
        return $(byXpath("/html/body/div[4]/h2")).shouldBe(visible).getText();
    }
}