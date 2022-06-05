    package com.codehub.tutor.core.model;

    import javax.persistence.*;

    @Entity
    @Table(name = "student")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long studentId;
        @Column(name = "first_name")
        private String firstName;
        @Column(name = "last_name")
        private String lastName;
        @Column(name = "address")
        private String address;
        @Column(name = "email")
        private String email;
        @Column(name = "phone_number")
        private String phoneNumber;
        @Column(name = "parent_whats_app")
        private String parentWhatsAppNumber;
        @Column(name = "dob")
        private String dob;

        public long getStudentId() {
            return studentId;
        }

        public void setStudentId(long studentId) {
            this.studentId = studentId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getParentWhatsAppNumber() {
            return parentWhatsAppNumber;
        }

        public void setParentWhatsAppNumber(String parentWhatsAppNumber) {
            this.parentWhatsAppNumber = parentWhatsAppNumber;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }
    }
