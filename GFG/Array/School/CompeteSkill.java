class CompeteSkill{
   public static void main(String[] args) {
      long[] skill_of_A={5, 6, 3};
      long[] skill_of_B={5, 6, 3};

      scores(skill_of_A,skill_of_B);
   }

   public static void scores(long a[], long b[]){
      int a_skill=a.length;
      int b_skill=b.length;
      int a_skill_point=0;
      int b_skill_point=0;

      for(int i=0; i<a_skill;i++){
        if(a[i]>b[i]){
          a_skill_point++;
        }
        else if(b[i]>a[i]){
           b_skill_point++;
        }
        else if(b[i]==a[i]){
           //System.out.println("\n\t b_skill_point "+b_skill_point+", a_skill_point "+a_skill_point);
        }
      }

      System.out.println("\n\t b_skill_point "+b_skill_point+", a_skill_point "+a_skill_point);
   }
}