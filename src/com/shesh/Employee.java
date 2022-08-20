package com.shesh;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employee{
        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Employee() {
        }
    }