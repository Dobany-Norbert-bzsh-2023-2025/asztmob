import { Text, View } from "react-native";
import Button from "./Button";

const HomeScreen = ({navigation}) => {
    return (
        <View>
            <Text>Home</Text>
            <Button title="Teacher" onPress={() => navigation.navigate("Teacher")} />
            <Button title="Subject" onPress={() => navigation.navigate("Subject")} />
            <Button title="Question" onPress={() => navigation.navigate("Question")} />
        </View>
    );
}

export default HomeScreen