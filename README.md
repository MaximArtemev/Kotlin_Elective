ANSWERS

***Answer 1:
    man -f "name"

***Answer 2:
    man 1 -> user commands
    man 2 -> System calls

*** Answer 3:
    cat -> concatenate and print files
    grep -> file pattern searcher
    head -> display first lines of a file
    ls -> list directory contents
    ps -> process status
    sort -> sort lines of text files
    tail -> display the last part of a file
    top -> display and update sorted information about processes
    wc -> word, line, character, and byte count
    yes -> be repetitively affirmative

*** Answer 4:
    По имени

*** Answer 5:
    up8-4.C | 2260 | 644

*** Answer 6:
    ls -lS

*** Answer 7:
    Вывел, это nanorc -> set nowrap

*** Answer 8:
    Там будет результат выполнения ls -l /etc/passwd /etc/networks, включая поток ошибок, то есть подробная информация о каталогах /etc/passwd /etc/networks

*** Answer 9:
    cat /etc/hosts > ~/file3
    cat /etc/passwd >> ~/file3
    cat /etc/fstab >> ~/file3

*** Answer 10:
    4

*** Answer 11:
    Запишется только abc\n, а это как раз 4

*** Answer 12:
    5 in file5, 4 in file6
    Потому что во втором случае не записался \n

*** Answer 13:
    Абсолютный путь от корневого каталога

*** Answer 14:
    /usr/include

*** Answer 15:
    time = current time
    permission = 755

*** Answer 16:
    drwxr-x---   2 max  staff     68  1 июн 23:51:46 2017 newT

*** Answer 17:
    6

*** Answer 18:
    /etc/c?o*

*** Answer 19:
    "/home/2010/*"

*** Answer 20:
    -rw-r--r--@ 1 max  staff   213  2 июн 00:03 hosts
    -rw-r--r--  1 max  staff  6393  2 июн 00:03 passwd

*** Answer 21:
    -rw-r--r--@ 1 max  staff   213  2 июн 00:03 host
    -rw-r--r--  1 max  staff  6393  2 июн 00:03 passwd

*** Answer 22:
    user - текущий юзер
    uid - id юзера

*** Answer 23:
    /bin/bash

*** Answer 24:
    /etc:"Предыдущий путь":/usr/include

*** Answer 25:
    /usr/bin/who

*** Answer 26:
    1 для ls /123
    0 для ls /home

*** Answer 27:
    Куча ошибок по поводу плохой инициализации переменных
    По поводу того что там == плохое
    По неиспользованию библиотек

*** Answer 28:
    -rwxr-xr-x  1 max  staff  8480  2 июн 00:26 aplusb

*** Answer 29:
    618

*** Answer 30:
    ./aplusb < 001.dat > 001.res 

*** Answer 31:
    7011

*** Answer 32:
    0m0.001s

*** Answer 33:
    459999999
    Пришлось выключить оптимизацию

*** Answer 34:
    Среди всех процессов находит те, в названии которых содержится sh

**** Hard:

*** Answer 35:
    У меня ulimit -c выводит 0
    ulimit -c запрешает создавать core файлы
    Т.e максимум созданных core файлов = 0

*** Answer 36:
    Создал elf файл, но из за того что на маке, не могу использовать readelf, а аналоги чего-то не особо хорошо работают

*** Answer 37:
    ls -l < list
    head -6 < top 5
    grep .conf < in it
    sort -n < sort by size
    
    Ответ: 
    ls -l | grep .conf | perl -e 'print sort { length($a) <=> length($b) } <>' | head -6 | sort -n

*** Answer 38:
    cat /usr/share/dict/words | grep -iv '[aeiou]' | wc -l 
    Вот так
