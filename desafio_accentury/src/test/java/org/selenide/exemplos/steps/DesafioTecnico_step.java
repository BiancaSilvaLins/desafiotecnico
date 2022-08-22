package org.selenide.exemplos.steps;

import org.junit.Assert;
import org.selenide.exemplos.paginas.desafioTecnicoPage;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DesafioTecnico_step {

    private desafioTecnicoPage desafio = new desafioTecnicoPage();

    @After
    public void tearDown(){
        Selenide.close();
    }

    @Given("que estou na tela inicial do sistema sampleapp")
public void que_estou_na_tela_inicial_do_sistema_sampleapp() throws InterruptedException {
    desafio.navegar();
}

@Given("preencher o formulário Enter Vehicle Data")
public void preencher_o_formulário_Enter_Vehicle_Data() {
    desafio.selecionarCampoMake();
    desafio.selecionarCampoModel();
    desafio.preencherCampoCylinderCapacity();
    desafio.preencherCampoEnginePerformance();
    desafio.preencherCampoDateOfManufacture();
    desafio.preencherCampoNumberOfSeats();
    desafio.clicarCheckBox();
    desafio.selecionarCampoNumberOfSeats();
    desafio.selecionarCamoFuelType();
    desafio.preencherCampoPayload();
    desafio.preencherCampoTotalWeight();
    desafio.preencherCampoListPrice();
    desafio.preencherCampoLicensePlateNumber();
    desafio.preencherCampoAnnualMileage();
}

@Given("clicar no botão next")
public void clicar_no_botão_next() {
    desafio.clicarBotaoNext();
}

@Given("clicar no botão next aba Enter Innsurante Data")
public void clicar_no_botão_next_aba_Enter_Innsurante_Data() {
    desafio.clicarBotaoNext2();
}

@Given("clicar no botão next aba Enter Product Data")
public void clicar_no_botão_next_aba_Enter_Product_Data() {
    desafio.clicarBotaoNext3();
}

@Given("clicar no botão next aba Select Price Option")
public void clicar_no_botão_next_aba_Select_Price_Option() {
    desafio.clicarBotaoNext4();
}

@Given("preencher o formulário, aba Enter Insurant Data")
public void preencher_o_formulário_aba_Enter_Insurant_Data() {
    desafio.preencherCampoFirstName();
    desafio.preencherCampoLastName();
    desafio.preencherCampoDateOfBirth();
    desafio.clicarCheckBoxGender();
    desafio.preencherCampoStreetAddress();
    desafio.selecionarCampoCountry();
    desafio.preencherCampoZipCode();
    desafio.preencherCampoCity();
    desafio.selecionarCampoOccupation();
    desafio.selecionarCheckBoxHobbies();
}

@Given("preencher o formulário, aba Enter Product Data")
public void preencher_o_formulário_aba_Enter_Product_Data() {
    desafio.preencherCampoStartDate();
    desafio.selecionarCampoInsuranceSum();
    desafio.selecionarCampoMeritRating();
    desafio.selecionarCampoDamageInsurance();
    desafio.clicarCheckBoxOptionalProducts();
    desafio.selecionarCampoCourtesyCar();
}

@Given("preencher o formulário, aba Select Price Option")
public void preencher_o_formulário_aba_Select_Price_Option() {
    desafio.clicarCheckBoxUltimate();
}

@Given("preencher o formulário, aba Send Quote")
public void preencher_o_formulário_aba_Send_Quote() {
    desafio.preencherCampoEmail();
    desafio.preencherCampoPhone();
    desafio.preencherCampoUsername();
    desafio.preencherCampoPassword();
    desafio.preencherCampoConfirmPassword();
    desafio.preencherCampoComments();
}

@When("clicar no botão send")
public void clicar_no_botão_send() {
    desafio.clicarBotaoSend();
}

@Then("validar mensagem de sucesso {string}")
public void validar_mensagem_de_sucesso(String string) throws InterruptedException {
    Thread.sleep(10000);
    Assert.assertEquals(desafio.mensagemSucesso(string),string);
}
}