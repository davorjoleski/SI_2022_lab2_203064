davor joleski 203064
Втора лабораториска вежба по Софтверско инженерство</br> 
Control Flow Graph


![SILABslika](https://user-images.githubusercontent.com/82174803/171939621-37f93d5d-ae7d-4a64-8a5a-b5a889b3ff87.png)

 Цикломатската комплексност на овој код е 9, истата ја добив со броење под циклуси  каде се 8 и надворешниот +1 вк=9 

Тест случаи според критериумот Every statement
	null	0,0,0,0,#,#,#,0,0		0,0,0,0,0
1	t	t		t
2	t	t		t
3	t			
4		t		t
5		t		t
6		t		t
7				t
8		t		
9.1		t		
9.2		t		
9.3		t		
10		t		
11		t		
12		t		
13		t		
14		t		
15		t		
16		t		
17		t		
18		t		
19		t		
20		t		
21		t		
22		t		
23	t	t		
24	t	t		t
![image](https://user-images.githubusercontent.com/82174803/171940542-b6794140-3a91-45d0-b497-a9578ded16db.png)

1. za null proveruvame  odi do 3 frla exception odi direktno na 23 24 zavrsuva 
2. 0,0,0,0,#,#,#,0,0 odi  1,2 3 go preskoknuva ,4 zema golemina 5 koren 6 e razlicno od vk broj 3!=9 odime 8 9.1 9.2 
  za i=0 razlicn # sto znaci tocno (!)  vlaga vo ifovite gi razgleduvame T i -T sekoj if isto taka od pod ifovite
   ni ostanuvaat uste 7
3. 0,0,0,0,0 odi do 7ca frla execption i zavrsuva progrmata
 3->slucai


Тест случаи според критериумот Every Branch
![branch](https://user-images.githubusercontent.com/82174803/171941750-989f5dd4-8bfe-4607-8957-42ac1510793a.png)

imame plus uslov za 16,17-18,19 kaj dvata if-statments koj go zadovoluva  # # #  4 5 6 7 # 9
prethodnite uslovi si se istite  
sto znaci imame 4 slucai

Gradle Simple Build: Овој билд го правам на тој начин што , пуштам команд промпт, наоѓам слободна локација, го сетирам пред тоа Gradle, тој треба да се конфигурира во Advanced Settings, во компјутерот за (Windows). 1.gradle init. Селектираме што сакаме според мене 1 за basic gradle build.

IntelliJ Unit Test: Правиме нов прект како што е наведено во аудит. вежби, ставаме локација каде што веке е направен Gradle buildot, t.e init. После мои креации на тест кејсови, дојдов до овој заклучок.

![gradlescr](https://user-images.githubusercontent.com/82174803/171943009-7245a244-de5e-42cb-8b6f-c1b1346c9f71.png)

   Ги правам најглавните тестирања кои според мене треба да постојат. Деталниот код за една од тестирањата. (сите се слични со различни ведности).
   
   ![evrybranch2](https://user-images.githubusercontent.com/82174803/171943622-da087fae-ed04-4959-a7bb-534d9a3a940a.png)

   
