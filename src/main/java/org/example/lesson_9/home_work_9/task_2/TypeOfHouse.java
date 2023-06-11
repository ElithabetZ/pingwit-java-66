package org.example.lesson_9.home_work_9.task_2;

//TypeOfHouse звучит как enum, а не класс. Этот надо было назвать по заданию -  городская многоэтажка/загородный дом
    public class TypeOfHouse extends House {

        private int numberOfFloar;
        private double numberOfPeople;

        public TypeOfHouse(String typeOfHouse, int numberOfFloar, double numberOfPeople)
        {
            super(typeOfHouse);
            this.numberOfFloar = numberOfFloar;
            this.numberOfPeople = numberOfPeople;
        }
        @Override
        public int getNumberOfFloars() {
            return numberOfFloar;
        }

        @Override
        public void turnOnHiting() {
            System.out.println("Hiting is turn on");
        }

        @Override
        public double getNumberOfPeople() {
            return numberOfPeople;
        }

        @Override
        public String toString() {
            return
                    "numberOfFloar=" + numberOfFloar +
                    ", numberOfPeople=" + numberOfPeople;
        }
    }

