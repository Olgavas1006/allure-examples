package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Layer("web")
@Owner("Olgavas1006")
@Feature("Authorization")
public class ManualTest {

    @Test
    @Manual
    @Microservice("Auth")
    @DisplayName("Проверка авторизации через GitHub")
    public void testAuth(){
        step("Открыть главную страницу");
        step("Авторизуемся как пользователь Тест Иванов", () -> {
            step("Вводим логин test_ivanov");
            step("Вводим пароль test@ivi");
            step("Нажимаем кнопку \"Войти\"");
        });
        step("Проверяем переход на страницу профиля");
    }
}
