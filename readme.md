


Post запрос `http://localhost:8080/letters/putLetter`
```xml
<Письмо_инопланетянам xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <код_расы>
        <value>A2</value>
    </код_расы>
    <created date_time="2022-01-20T16:45:06+03:00"/>
    <uid>
        <code>
            <value>c36ba6b0-951d-4b16-8bff-4ac3abb0dc59</value>
        </code>
    </uid>
    <author>
        <id>
           <value>ISO_639-1</value>
        </id>
    </author>
    <author>
        <id>
            <value>ISO_965-44</value>
        </id>
    </author>
    <author>
        <id>
            <value>ISO_139-5</value>
        </id>
    </author>
    <document>
        <text>Здравствуйте, уважаемые правители Татуина!
            Мы предлагаем Вам наши услуги по озеленению Вашей планеты. Наша компания имеет большой опыт в этой области, и мы готовы предоставить Вам наши знания и ресурсы для достижения Вашей цели.
            Для озеленения планеты используются различные ресурсы, такие как вода, почва, семена и удобрения. В зависимости от условий на планете могут использоваться различные методы озеленения. Например, на пустынных планетах могут использоваться специальные технологии для выращивания деревьев в засушливых условиях, различные овощи и фрукты, которые обладают способностью противостоять экстремальным климатическим явлениям.
        </text>
        <address>
            <value>Планета Земля</value>
        </address>
        <tel>
            <value>(847)586-17-24</value>
        </tel>
    </document>
</Письмо_инопланетянам>
```
Ответ
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<letter>
    <title>
        <description>Официальное письмо народу Татуина от землян</description>
        <theme text="Озеленение пустыни"/>
        <alien_race code="A2"/>
        <created>2023-02-21_16:45</created>
        <id description="Идентификатор письма" value="c36ba6b0-951d-4b16-8bff-4ac3abb0dc59"/>
        <authors>
            <employee>
                <name>Иван</name>
                <second_name>Иванов</second_name>
                <lastname>Иванович</lastname>
                <position>Старший научный сотрудник по добыче полезных ископаемых</position>
            </employee>
            <employee>
                <name>Наталья</name>
                <second_name>Сидорова</second_name>
                <lastname>Николаевна</lastname>
                <position>Директор департамента озеленения пустынь</position>
            </employee>
            <employee>
                <name>Перт</name>
                <second_name>Петров</second_name>
                <lastname>Петрович</lastname>
                <position>Главный инженер по строительству межзвездных автострад</position>
            </employee>
        </authors>
    </title>
    <message>
        <paragraph>Dif-tor heh smusma, уважаемые правители Татуина!</paragraph>
        <paragraph>            Мы предлагаем Вам наши услуги по озеленению Вашей планеты. Наша компания имеет большой опыт в этой области, и мы готовы предоставить Вам наши знания и ресурсы для достижения Вашей цели.</paragraph>
        <paragraph>            Для озеленения планеты используются различные ресурсы, такие как вода, почва, семена и удобрения. В зависимости от условий на планете могут использоваться различные методы озеленения. Например, на пустынных планетах могут использоваться специальные технологии для выращивания деревьев в засушливых условиях, различные овощи и фрукты, которые обладают способностью противостоять экстремальным климатическим явлениям.</paragraph>
        <paragraph>        </paragraph>
        <paragraph>Надеюсь, это поможет Вам. Если у Вас есть какие-либо дополнительные вопросы, пожалуйста, не стесняйтесь спрашивать. С уважением, Земляне!</paragraph>
    </message>
    <contacts>
        <tel number="8475861724"/>
        <address description="Планета Земля"/>
    </contacts>
    <sent_time>2023-06-10 18:56</sent_time>
</letter>
```