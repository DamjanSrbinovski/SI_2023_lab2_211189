# Damjan Srbinovski 211189
## Control Flow Graph
![CFG_SI_lab2](https://github.com/DamjanSrbinovski/SI_2023_lab2_211189/assets/94912556/09dc04c2-56ce-4cbb-a18e-80f3fb60a6c9)
</br>
### Цикломатската комплексност на овој код изнесува 11 и истата може да се пресмета на 3 начини:
* Број на ребра - број на јазли + 2. 
* Број на региони.
* Број на decision points + 1.
#### Во кодот се користи статичка низа од типот User и кодот за нејзе изгледа вака:
 User user1 = new User("damjan_srbinovski@live.com","Damjan123123%","damjan_srbinovski@live.com"); </br>
 User user2 = new User("Bozo","Bozhidar123%","damjan_srbinovski@live.com"); </br>
 User user3 = new User("Mihael","Mihael123123%","damjan_srbinovski@live.com"); <br/>
##### Тестовите за every statement се следните:
#### Тест 1. </br>
* new User(null,null,null)

Во овој тест случај кодот ни фрла exception и стига до B јазол од CFG-то.
#### Тест 2. </br>
* User user = new User(null, "xxxxx","damjan_srbinovski@live.com");

Во овој тест случај кодот ни враќа false и стига до R јазол од CFG-то поради тоа што пасс е помал од 8 букви.
#### Тест 3. </br>
* User user = new User(null, "damjan123*","damjan_srbinovski@live.com");

Во овој тест случај кодот ни враќа false и стига до X јазол од CFG-то поради тоа што постои ист корисник во листата со корисници.
#### Тест 4. </br>
* User user = new User(null, "damjan123123","damjan_srbinovski@live.com");

Во овој тест случај кодот се терминира и стига до Y јазол од CFG-то.
##### Тестовите за multiple condition се следните:
* Во истите се опфатени само условите кои не беа задоволени до сега за исполнувањето на условот за multiple condition тестингот.
#### Тест 5.
* RuntimeException ex;
  ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));
  
* ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,"xxxxx",null), userList(user1,user2,user3))); 
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));

* ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
  assertTrue(ex.getMessage().contains("Mandatory information missing!"));


Тука проверуваме со 3 различни тестови дали ќе ни падне програмата со тоа што најпрво го пуштаме User-от да има вредност null,
во вториот случај пуштаме корисник кој нема наведено пасс, а во третиот случај пуштаме корисник каде што нема соодветна мејл адреса. 
#### Тест 6.
* User user = new User(null, "xxxxx","damjan_srbinovski@live.com");

Со оваа проверка го фаќаме условот во јазолот R каде што корисникот неговиот пассворд е помал од 8 карактери и ни враќа false statement.
#### Тест 7.
* User user = new User(null, "damjan 12343","damjan_srbinovski@live.com");
Со оваа проверка го фаќаме условот во јазолот R каде што корисникот неговиот пассворд го содржи неговиот username и ни враќа false statement.

