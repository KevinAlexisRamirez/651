from tkinter import *
import random

class SieteAfortunado:
    def __init__(self):
        self.crear_interfaz()

    def crear_interfaz(self):
        ventana = Tk()
        ventana.minsize(340, 450)
        ventana.geometry('340x450')
        boton = Button(ventana, text='jugar!!', command=self.jugar, font='arial 18 bold')
        boton.pack()
        self.foto = PhotoImage(file=r'Money.png')
        self.gano = Label(ventana, image=self.foto)

        self.campos = [StringVar() for _ in range(3)]
        posicion = 10
        for campo in self.campos:
            label = Label(ventana, textvariable=campo, background='White', foreground='Black', font='arial 42 bold')
            label.place(x=posicion, y=100, width=100, height=100)
            posicion += 110
        mainloop()

    def generar_numero(self):
        return random.randint(0, 9)

    def jugar(self):
        valores = [self.generar_numero() for _ in range(3)]

        for i in range(3):
            self.campos[i].set(valores[i])

        if all(val == '7' for val in self.campos):
            self.mostrar_mensaje_ganador()
        else:
            self.ocultar_mensaje_ganador()

    def mostrar_mensaje_ganador(self):
        self.gano.pack(side=BOTTOM)

    def ocultar_mensaje_ganador(self):
        self.gano.pack_forget()

jugar = SieteAfortunado()
