INSERT INTO SCHOOL_SUBJECT (SCHOOL_SUBJECT_ID, DIFFICULTY, NAME, DESCRIPTION) VALUES
(1, 10, 'Mathematics', 'Mathematics is the study of numbers, shapes and patterns.'),
(2, 9, 'Geography', 'Geography (from Greek: γεωγραφία, geographia, literally "earth description") is the study of earth and its people.'),
(3, 9, 'Music', 'Music is a form of art; an expression of emotions through harmonic frequencies.'),
(4, 9, 'History', 'History is the study of past and future events.');

INSERT INTO SCHOOL_SUBJECT_TRANSLATION(SCHOOL_SUBJECT_ID, LANGUAGE_ID, NAME, DESCRIPTION) VALUES
(1, 'sr', 'Математика', 'Математика (грч. μαθηματική што значи учење) је формална и егзактна наука која је настала изучавањем фигура и рачунањем с бројевима.'),
(1, 'es', 'Matemáticas', 'Las matemáticas o la matemática (del latín mathematĭca, y este del griego μαθηματικά, derivado de μάθημα, ‘conocimiento’) es una ciencia formal que, partiendo de axiomas y siguiendo el razonamiento lógico, estudia las propiedades y relaciones entre entidades abstractas como números, figuras geométricas, iconos, glifos, o símbolos en general.'),
(2, 'sr', 'Географија', 'Географија или земљопис је комплексна наука која проучава природне и друштвене појаве и процесе у геопростору, те везе и односе између њих.'),
(2, 'es', 'Geografía', 'La geografía (del latín geographĭa, y este del griego γεωγραφία [geōgraphía],​ literalmente traducido como «descripción de la tierra») es la disciplina que trata de la descripción o de la representación gráfica de la Tierra.'),
(3, 'sr', 'Музика', 'Музика (грч. μουσική - уметност муза, лат. musica) је уметност стварања уређених односа између тонова. Музика има три основна елемента: мелодију, ритам и хармонију.'),
(4, 'sr', 'Историја', 'Историја (од грчке ријечи ἱστορία [istoría] — историа, што значи „истраживање, знање које се стиче истраживањем“) или повијест (екав. повест) јесте наука о прошлости, која се нарочито односи на људе.'),
(4, 'es', 'Historia', 'La historia es la ciencia que tiene como objetivo el estudio de sucesos del pasado, tradicionalmente de la humanidad1​, y como método, el propio de las ciencias sociales/humanas, así como el de las ciencias naturales en un marco de interdisciplinariedad.');