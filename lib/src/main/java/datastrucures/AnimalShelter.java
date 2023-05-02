package datastrucures;

import stackandqueue.Queue;

public class AnimalShelter {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;

    public AnimalShelter() {
        dogs = new Queue<>();
        cats = new Queue<>();
    }

    public void enqueue(Animal animal) {
        if (animal.species.equals("dog")) {
            dogs.enqueue(animal);
        } else if (animal.species.equals("cat")) {
            cats.enqueue(animal);
        } else {
            throw new IllegalArgumentException("Animal must be either a dog or a cat");
        }
    }

    public Animal dequeue(String pref) {
        if (pref.equals("dog")) {
            if (dogs.isEmpty()) {
                return null;
            }
            return dogs.dequeue();
        } else if (pref.equals("cat")) {
            if (cats.isEmpty()) {
                return null;
            }
            return cats.dequeue();
        } else {
            return null;
        }
    }

    public static class Animal {
        private String species;
        private String name;

        public Animal(String species, String name) {
            this.species = species;
            this.name = name;
        }

        public String getSpecies() {
            return species;
        }

        public String getName() {
            return name;
        }
    }
}
