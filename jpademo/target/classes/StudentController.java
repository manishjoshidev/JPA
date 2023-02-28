
public class StudentController {
@Controller
public class StudentController{
	@RequestMapping("registration")
	public String displayRegistrationForm(Model m)
	{
		Student std=new Student();
		m.addAttribute("stdreg",std);
		return "registration-form";
		}
	@RequestMapping("submitForm")
	public String("submitForm")
	public String submitForm(@ModelAttribute("stdreg")Student std)
	{
		EntityManagerFactory ef=Persistance.createEntityManagerFactory("puc");
		EntityManager em=ef.createEntityManager();
		em.getTransaction().begin();
		em.persist(sid);
		em.getTransaction().commit();
		em.persist(std);
		em.getTransaction()commit();
		return "confirmation";
	}
}
}
