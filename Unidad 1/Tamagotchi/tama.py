import time
import threading

class Tamagotchi:
    def __init__(self):
        self.alive = True
        self.hunger = 0
        self.thirst = 0
        self.start_time = time.time()
        self.last_feed_time = self.start_time
        self.last_water_time = self.start_time

    def feed(self):
        self.hunger = 0
        self.last_feed_time = time.time()

    def water(self):
        self.thirst = 0
        self.last_water_time = time.time()

    def check_status(self):
        current_time = time.time()
        elapsed_time = current_time - self.start_time

        if elapsed_time >= 300:  
            self.alive = False
            print("Tu Tamagotchi ha muerto por su edad, 5 minutos")

    def auto_actions(self):
        while self.alive:
            current_time = time.time()
            if current_time - self.last_feed_time >= 20:  
                print("Tamagotchi tiene hambre")
                time.sleep(7) 
                if self.hunger >= 10:
                    self.alive = False
                    print("Tu Tamagotchi ha muerto de hambre.")
                    break
            if current_time - self.last_water_time >= 35:
                print("Tamagotchi tiene sed ")
                time.sleep(7)
                if self.thirst >= 10:
                    self.alive = False
                    print("Tu Tamagotchi ha muerto de sed.")
                    break
            time.sleep(1) 

    def run(self):
        auto_actions_thread = threading.Thread(target=self.auto_actions)
        auto_actions_thread.start()

        while self.alive:
            self.check_status()
            print("Tamagotchi\n---------")
            print(f"Hambre: {self.hunger}")
            print(f"Sed: {self.thirst}")
            print("\nOpciones:")
            print("1. Alimentar")
            print("2. Dar agua")
            print("3. Salir")
            print("4. Reiniciar")
            
            choice = input("Elige una opción: ")
            
            if choice == '1':
                self.feed()
                print("ha sido alimentado.")
            elif choice == '2':
                self.water()
                print("ha bebido agua.")
            elif choice == '3':
                self.alive = False
                print("Adiós.")
            elif choice == '4':
                self.__init__()
                print("Tamagotchi reiniciado.")
            
            time.sleep(1)  
        auto_actions_thread.join()

if __name__ == "__main__":
    tamagotchi = Tamagotchi()
    tamagotchi_thread = threading.Thread(target=tamagotchi.run)
    tamagotchi_thread.start()
    tamagotchi_thread.join()
