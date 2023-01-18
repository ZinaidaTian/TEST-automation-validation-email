package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора меню пользователя
     */
//    @FindBy(xpath = "//*[contains(@class, 'account__name_hasAccentLetter')]")
//    private WebElement userMenu;
//    /**
//     * определение локатора кнопки выхода из аккаунта
//     */
//    @FindBy(xpath = "//*[contains(@class, 'menu-item_action_exit menu__item menu__item_type_link')]")
//    private WebElement logoutBtn;
//    /**
//     * метод для получения имени пользователя из меню пользователя
//     */
//    public String getUserName() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'account__name_hasAccentLetter')]")));
//        String userName = userMenu.getText();
//        return userName; }
    /**
     * метод для нажатия кнопки меню пользователя
     */
//    public void entryMenu() {
//        userMenu.click(); }
//    /**
//     * метод для нажатия кнопки выхода из аккаунта
//     */
//    public void userLogout() {
//        logoutBtn.click(); }
        }