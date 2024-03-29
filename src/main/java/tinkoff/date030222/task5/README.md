# Задача E. Горы #
	Имя входного файла: стандартный ввод
	Имя выходного файла: стандартный вывод
	Ограничение по времени: 1.5 секунд
	Ограничение по памяти: 512 мегабайт
	
Лягушонок Линк решил забраться на гору высотой n метров во время дождя. Поскольку в дождь горы скользкие, то после каждого прыжка Линк соскальзывает на некоторое расстояние вниз. Более формально, если Линк делает прыжок, будучи на расстоянии i метров от вершины, то он может прыгнуть на любую высоту от 0 до ai дополнительных метров наверх. Но схватившись за скалу на расстоянии j метров от вершины, Линк проскользит вниз на bj метров. От вас требуется определить минимальное количество прыжков, которое потребуется Линку для подъема наверх.

### Формат входных данных ###
В первой строке задано целое положительное число n (1 <= n <= 300 000) — высота горы.
Во второй строке задано n целых чисел a1, a2, . . . , an (0 <= ai <= i) — максимальная высота,
доступная для прыжка на заданном расстоянии от вершины.
В третьей строке вводится n целых чисел b1, b2, . . . , bn (0 <= bi <= n − i) — количество метров,
которые лягушонок проскользит вниз, приземлившись на расстоянии i от вершины.

### Формат выходных данных ###
В первой строке выведите целое число k — минимально возможное количество прыжков. В
случае, если Линк не сможет добраться до верха горы, выведите −1.

#### Замечание ####
В первом тесте из условия Линк за один прыжок поднимается к отметке на расстоянии 1 метр от вершины. После этого он соскальзывает вниз на метр. Следующим прыжком он запрыгнет на гору.