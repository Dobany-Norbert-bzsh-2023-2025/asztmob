import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Text, TouchableHighlight, View } from 'react-native';
import { TextInput } from 'react-native';
import { Image } from 'react-native';
 
function calcTriangleArea(base, height) {
  return base * height / 2;
}
 
export default function App() {
  const [base, setBase] = useState('');
  const [height, setHeight] = useState('');
  const [area, setArea] = useState('');
  function startCalc() {
    let result = calcTriangleArea(base, height);
    setArea(result);
  }
  return (
    <View style={styles.container}>

<Image 
    source={require('./assets/36-536x354.jpg')}
    style={{width: 100, height: 100 }}
/>

      <Text>Triangle</Text>
      <Text>Háromszög területszámítás</Text>
 
      {/* Alap bekérése */}
      <Text>Alap</Text>
      <TextInput
      style={styles.input}
      onChangeText={base => setBase(base)}
      />
 
      {/* Magasság bekérése */}
      <Text>Magasság</Text>
      <TextInput
      style={styles.input}
      onChangeText={height => setHeight(height)}
      />
 
      {/* Saját nyomógomb */}
      <TouchableHighlight
        style={styles.button}
        onPress={startCalc}
      >
        <Text style={styles.buttonText}>Számít</Text>
      </TouchableHighlight>
 
      <Text>Terület</Text>
      {/* TERÜLET */}
      <TextInput
      style={styles.input}
      onChangeText={area => setArea(area)}
      value={area}
      />

      <StatusBar style="auto" />
    </View>
  );
}
 
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'grey',
    alignItems: 'center',
    justifyContent: 'center',
  },
  button: {
    backgroundColor: 'red',
    marginTop: 10,
    padding: 10,
    borderRadius: 3,
 
  },
  butotnText: {
    color: 'white',
    paddingLeft: 10,
    paddingRight: 10,
    fontSize: 22,
  },
  input: {
    backgroundColor: 'white',
    height: 30,
  }
});