import "@expo/metro-runtime"
import { NavigationContainer } from '@react-navigation/native';
import { StatusBar } from "expo-status-bar";
import { Text, View, StyleSheet } from 'react-native';
import QualityStack from "./comps/QualityStack";



export default () => {
  return ( 
        <NavigationContainer>
          <QualityStack />
        </NavigationContainer>
  );
}