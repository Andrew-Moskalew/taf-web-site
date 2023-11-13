package by.itacademy.moskalew;

public class Website21vekbyPage {
    public String buttonAccount = "//*[@id=\"header\"]/div/div[3]/div/div[3]/div/div/div/button/span";
    public String buttonLogin = "//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button";
    public String inputEmail = "//*[@id=\"login-email\"]";
    public String inputPassword = "//*[@id=\"login-password\"]";
    public String errorMassageEmailNotFound = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]"; //Электронная почта не указана
    public String errorMassageEmailInvalidFormat = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[1]/div[3]/span[2]";  //Неправильный формат электронной почты
    public String errorMassagePasswordNotFound = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/span[2]";  //Пароль не указан
    public String errorMassagePasswordInvalid = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]";  //Неправильный пароль.
    public String buttonEnter = "//*[@id=\"default-:R2mm:-modal\"]/div/div/div[2]/div/div/form/div/div[3]/button";
    public String buttonCookieReject = "//*[@id=\"modal-cookie\"]/div/div[2]/div/button[2]/div";
}
