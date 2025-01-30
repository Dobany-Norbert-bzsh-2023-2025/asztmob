import { createNativeStackNavigator } from "@react-navigation/native-stack"
import HomeScreen from "./HomeScreen";
import TeacherScreen from "./TeacherScreen";
import SubjectScreen from "./SubjectScreen";
import QuestionScreen from "./QuestionScreen";

const stack = createNativeStackNavigatoror()
const QualityStack = () => {
    return (
        <Stack.Navigator>      
          <Stack.Screen name="Home" component={HomeScreen} />
          <Stack.Screen name="Teacher" component={TeacherScreen} />
          <Stack.Screen name="Subject" component={SubjectScreen} />
          <Stack.Screen name="Question" component={QuestionScreen} />
        </Stack.Navigator>
      );
}

export default QualityStack