SingleTable Inheritence:
Take All Attributes From All SubClasses Including SuperClass & Create A Table.Also Foreign Key Must Be In Table,So All External Association Must Be Placed In SuperClass.
Some Of Fields/Columns May Be Null Due To All SubClasses Share Common SuperClass Attribute,But Not Their Own Attribute. 
Change SuperClass Annotation @Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
Add @DiscriminatorColumn(name="NameOfTheColumnToDifferentiateBetweenSubClasses") In SuperClass.
As Table Will Be Same For All SubClasses,Provide @Table(name="NameOfTheSingleTable"),In Our Case @Table(name="Investment").
Remove All @Table Annotation From SubClasses As All Are In Single Table.[edu.gandhi.prajit.april.chapter05.adventity.Stock,edu.gandhi.prajit.april.chapter05.adventity.Bond]
Also We Can Remove @TableGenerator In SuperClass,We Can Use Any @GeneratedValue(GenerationType)
Also Provide @DiscriminatorValue In Each SubClasses Otherwise Defaulted To Class Name.

If Query Got Complex,We Can Create A View & Make A Entity Out Of It.