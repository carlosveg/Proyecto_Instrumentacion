int b[8];
int expo;
int grado;
int i;
void setup() {
  Serial.begin(9600);
  pinMode(10,OUTPUT);//pushbutton

  for (i = 0; i < 8; i++) {
    pinMode(i+2, INPUT);
  }
}

void loop() {
  digitalWrite(10,LOW);
  delay(500);

  for (i = 0; i < 8; i++) {
    b[i] = digitalRead(i+2);    
  }

  for (i = 0 ; i < 8 ; i++) {
    if(b[i] == HIGH) {
      expo = expo+pow(2,i);
    }
  }
  
  grado = ((expo*100)/255) ;

  Serial.println(grado);

  grado = 0;
  expo = 0;
  
  digitalWrite(10,HIGH);
  delay(500);
}
