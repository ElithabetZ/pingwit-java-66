package org.example.lesson_13.home_work_13.task_2;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    //можно было еще как вариант использовать Arrays.copyOf/System.arraycopy
    public void addProduct(Product product) {
        Product[] temp = new Product[this.products.length + 1];
        for (int i = 0; i < this.products.length; i++) {
            temp[i] = products[i];
        }
        temp[this.products.length] = product;
        this.products = temp;
    }

    public void removeProduct(Product product) {
        Product[] temp = new Product[this.products.length - 1];
        int tempIteration = 0;
        for (int i = 0; i < this.products.length; i++) {
            /*
                можно сократить:
                 for (int i = 0; i < this.products.length; i++) {
                    if (!temp[i].equals(product)) {
                    temp[tempIteration++] = temp[i];
                    }
                }
            */
            if (this.products[i].equals(product)) {
                continue;
            } else {
                temp[tempIteration] = this.products[i];
                tempIteration++;
            }
        }
        this.products = temp;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < this.products.length; i++) {
            totalPrice += this.products[i].getPrice();
        }
        return totalPrice;
    }

    public double getTotalQuantity() {
        double totalQuantity = 0;
        for (int i = 0; i < this.products.length; i++) {
            totalQuantity += this.products[i].getQuantity();
        }
        return totalQuantity;
    }

    public void printCart() {
        System.out.println("Cart contains:");
        for (int i = 0; i < this.products.length; i++) {
            System.out.println(this.products[i].toString() +
                    " Product{" +
                    "name='" + this.products[i].getName() + '\'' +
                    ", price=" + this.products[i].getPrice() +
                    ", quantity=" + this.products[i].getQuantity() +
                    '}');
        }
    }
}
