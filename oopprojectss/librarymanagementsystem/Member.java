package oopprojectss.librarymanagementsystem;

public class Member {
        private int memberId;
        private String name;
        private String phoneNo;
        private String email;
        
        Member(int memberId , String name , String phoneNo , String email){
            this.memberId = memberId;
            this.name = name;
            this.phoneNo = phoneNo;
            this.email = email;
        }
        
        public int getMemberId(){
            return memberId;
        }
        public String getName(){
            return name;
        }
        public String getPhoneNo(){
            return phoneNo;
        }
        public String getEmail(){
            return email;
        }


        public void setMemberId(int memberId){
            this.memberId = memberId;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }
        public void setEmail(String email){
            this.email = email;
        }

}
