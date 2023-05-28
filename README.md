# Damjan Srbinovski 211189
## Control Flow Graph
![CFG_SI_lab2](https://github.com/DamjanSrbinovski/SI_2023_lab2_211189/assets/94912556/09dc04c2-56ce-4cbb-a18e-80f3fb60a6c9)
</br>
### Цикломатската комплексност на овој код изнесува 11 и истата може да се пресмета на 3 начини:
* Број на ребра - број на јазли + 2. 
* Број на региони.
* Број на decision points + 1.
#### Во кодот се користи статичка низа од типот User и кодот за нејзе изгледа вака:
#### User user1 = new User("damjan_srbinovski@live.com","Damjan123123%","damjan_srbinovski@live.com");
#### User user2 = new User("Bozo","Bozhidar123%","damjan_srbinovski@live.com");
#### User user3 = new User("Mihael","Mihael123123%","damjan_srbinovski@live.com"); <br/>
##### Тестовите за every statement се следните:
#### Тест 1. </br>
* new User(null,null,null)
#### Тест 2. </br>
* User user = new User(null, "xxxxx","damjan_srbinovski@live.com");
#### Тест 3. </br>
* User user = new User(null, "damjan123*","damjan_srbinovski@live.com");
#### Тест 4. </br>
* User user = new User(null, "damjan123123","damjan_srbinovski@live.com");
##### Тестовите за multiple condition се следните:
#### Тест 5.
* RuntimeException ex;
  ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));
  
* ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,"xxxxx",null), userList(user1,user2,user3))); 
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));

* ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));

#### Тест 6.
* User user = new User(null, "xxxxx","damjan_srbinovski@live.com");

#### Тест 7.
* User user = new User(null, "damjan 12343","damjan_srbinovski@live.com");

