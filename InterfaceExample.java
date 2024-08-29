package practice_programs_java.bin;

class InterfaceExample{
	public static void main(String[] args) {
		
		Interview jobOffer = new DeepNest();
		jobOffer.resumeScreening();
		jobOffer.takeInterview();
		jobOffer.giveOfferLetter();
		
		System.out.println();
		
		jobOffer = new GrmNest();
		jobOffer.resumeScreening();
		jobOffer.takeInterview();
		jobOffer.giveOfferLetter();
		
	}
	public void placements(Interview itv) {
		itv.resumeScreening();
		itv.takeInterview();
		itv.giveOfferLetter();
		
	}
}

interface Interview{
	public abstract void resumeScreening();
	public abstract void takeInterview();
	public abstract void giveOfferLetter();
}

class DeepNest implements Interview{
	public void resumeScreening() {
		System.out.println("DeepNest uses ATS to screen resumes");
	}
	public void takeInterview() {
		System.out.println("DeepNest has 3 levels of interview");
	}
	public void giveOfferLetter() {
		System.out.println("DeepNest provides offer after verification");
	}
	
}

class GrmNest implements Interview{
	public void resumeScreening() {
		System.out.println("GrmNest uses ATS to screen resumes");
	}
	public void takeInterview() {
		System.out.println("GrmNest has 3 levels of interview");
	}
	public void giveOfferLetter() {
		System.out.println("GrmNest provides offer after verification");
	}
	
}










