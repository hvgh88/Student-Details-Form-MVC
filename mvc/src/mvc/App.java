package mvc;
public class App {
public static void main(String[] args) {
// Assemble all the pieces of the MVC
	Model m = new Model("Harshita", "Vidapanakal", "harshita.vidapanakal@gmail.com", "9000000000", "9.16", "6");
	View v = new View("PES1UG19CS185");
	Controller c = new Controller(m, v);
	c.initController();
	}
}
