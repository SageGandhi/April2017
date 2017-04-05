Compound Primary Key:
Add @Id Annotation To Attribute Belongs To Primary Key Columns.(edu.gandhi.prajit.april.chapter00.adventity.Currency)
Create A Id Class That Contain All Those Above Attribute,Must Match Same Attribute Name In IdClass & Entity Class(edu.gandhi.prajit.april.chapter00.adventity.id.CurrencyCompoundId & edu.gandhi.prajit.april.chapter00.adventity.Currency).
Id Class Must Have Getters Only,One Constructor Without Parameter(So That Hibernate Can Create Instances) & Parameterized Constructor With All Attribute(So That We Can Use That Constructor While Use find Operation)
Implement Serializable-Marker Interface For Id Classes.
Use @IdClass Annotation In @Entity Class(edu.gandhi.prajit.april.chapter00.adventity.Currency) 