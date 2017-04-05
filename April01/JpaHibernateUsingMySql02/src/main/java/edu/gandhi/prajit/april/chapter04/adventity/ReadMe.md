TablePerClass Inheritence:
Extract Common Attributes To A SuperClass/Abstract Class:
Apply @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) & @Entity Annotation To This SuperClass.
We Need @Id In The Abstract Class.Also Different Strategy Like GenerationType.Table.
@Id @GeneratedValue(strategy=GenerationType.TABLE,generator="LogicalNameOfTheTableGenerator") @TableGenerator(table="PhysicalNameOfTheTable",pkColumnName="ColumnNameForPk",valueColumnName="ValueColumnName", name="LogicalNameOfTheTableGenerator")
All SubClass Will Share Same Primary Key Name.
All SubClass Will Share Same ForeignKey.
In OurCase edu.gandhi.prajit.april.chapter04.adventity.Portfolio Has OneToMany Association With edu.gandhi.prajit.april.chapter04.adventity.Investment.So edu.gandhi.prajit.april.chapter04.adventity.Bond & edu.gandhi.prajit.april.chapter04.adventity.Stock Will Have Same ForeignKey.
Remove @Id Annotation & Related Getters In SubClasses.
Underlying Database Will Perform The Union.Thats Why Same Primary,Foreign Key.