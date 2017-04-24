Default Name Of ApplicationContext.xml Is applicationContext.xml.
####Classes Used org.springframework.context.support.ClassPathXmlApplicationContext, org.springframework.beans.factory.xml.XmlBeanDefinitionReader.
@Repository--Data Layer,@Service--Service/Business Logic Layer,@Component--Any Spring Bean.
###?How To Define Multiple Bean Using@Repository,@Service,@Component?  
####Jsr-330 Is Dependency Injection For Java
Bean Scope:Singleton,Prototype,Request,Session,GlobalSession
###?Difference Between HashMap&Registry:?
org.springframework.beans.factory.config.PropertyPlaceholderConfigurer Created Behind The Scene When We Place This Xml Fragment.If NameSpace Required Use Following Kind Of Uri http://www.springframework.org/schema/context,It Will Select The Latest One.  