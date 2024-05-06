package com.example.potatoehead

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.potatoehead.ui.theme.PotatoeHeadTheme
import java.util.zip.CheckedInputStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PotatoeHeadTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {


        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Mr. Potato Head",
                color = Color(0xFFCCCCCC),
                fontSize = 30.sp

            )
        }

            var nose by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }
            var arms by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var ears by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var eyes by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var eyebrows by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var hat by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var mouth by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var shoes by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var mustache by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }

            var glasses by remember {
                mutableStateOf(androidx.core.R.drawable.ic_call_decline)
            }
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    Alignment.Center
                ) {


                    Image(
                        painter = painterResource(id = R.drawable.body),
                        contentDescription = "Body"
                    )
                    Image(painter = painterResource(id = arms), contentDescription = "arms")
                    Image(painter = painterResource(id = ears), contentDescription = "Ears")
                    Image(painter = painterResource(id = eyes), contentDescription = "Eyes")
                    Image(
                        painter = painterResource(id = eyebrows),
                        contentDescription = "Eyesbrows"
                    )
                    Image(painter = painterResource(id = hat), contentDescription = "Hat")
                    Image(painter = painterResource(id = mouth), contentDescription = "Mouth")
                    Image(painter = painterResource(id = shoes), contentDescription = "Shoes")
                    Image(
                        painter = painterResource(id = mustache),
                        contentDescription = "Moustaches"
                    )
                    Image(painter = painterResource(id = nose), contentDescription = "nose")
                    Image(painter = painterResource(id = glasses), contentDescription = "glasses")

                }

                    var checkboxNose by remember {
                        mutableStateOf(false)
                    }

                    var checkboxHat by remember {
                        mutableStateOf(false)
                    }
                    var checkboxEyebrow by remember {
                        mutableStateOf(false)
                    }
                    var checkboxMustache by remember {
                        mutableStateOf(false)
                    }
                    var checkboxArms by remember {
                        mutableStateOf(false)
                    }
        var checkboxEyes by remember {
            mutableStateOf(false)
        }
        var checkboxGlasses by remember {
            mutableStateOf(false)
        }
        var checkboxMouth by remember {
            mutableStateOf(false)
        }
        var checkboxEars by remember {
            mutableStateOf(false)
        }
        var checkboxShoes by remember {
            mutableStateOf(false)
        }
        Row(modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Click his parts to add/remove them!")
        }
        Row {

            Column(modifier = Modifier
                .width(40.dp)
            ) {

            }
            Column(modifier= Modifier
                .width(140.dp),
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(140.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {


                        Checkbox(
                            checked = checkboxHat,
                            onCheckedChange = { checkboxHat = it },
                        )
                        Text(text = "Hat")
                    }

                    if (checkboxHat == true) {

                        hat = R.drawable.hat
                    } else hat = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxEyebrow,
                            onCheckedChange = { checkboxEyebrow = it },
                        )
                        Text(text = "Eyebrows")
                    }
                    if (checkboxEyebrow == true) {

                        eyebrows = R.drawable.eyebrows
                    } else eyebrows = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxNose,
                            onCheckedChange = { checkboxNose = it },
                        )
                        Text(text = "Nose")
                    }
                    if (checkboxNose == true) {

                        nose = R.drawable.nose
                    } else nose = androidx.core.R.drawable.ic_call_decline

                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxMustache,
                            onCheckedChange = { checkboxMustache = it },
                        )
                        Text(text = "Mustache")
                    }
                    if (checkboxMustache == true) {

                        mustache = R.drawable.mustache
                    } else mustache = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxArms,
                            onCheckedChange = { checkboxArms = it },
                        )
                        Text(text = "Arms")
                    }
                    if (checkboxArms == true) {

                        arms = R.drawable.arms
                    } else arms = androidx.core.R.drawable.ic_call_decline
                }
            }
            Column(modifier= Modifier
                .width(140.dp),
                horizontalAlignment = Alignment.End
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(140.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {


                        Checkbox(
                            checked = checkboxEyes,
                            onCheckedChange = { checkboxEyes = it },
                        )
                        Text(text = "Eyes")
                    }

                    if (checkboxEyes == true) {

                        eyes = R.drawable.eyes
                    } else eyes = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxGlasses,
                            onCheckedChange = { checkboxGlasses = it },
                        )
                        Text(text = "Glasses")
                    }
                    if (checkboxGlasses == true) {

                        glasses = R.drawable.glasses
                    } else glasses = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxMouth,
                            onCheckedChange = { checkboxMouth = it },
                        )
                        Text(text = "Mouth")
                    }
                    if (checkboxMouth == true) {

                        mouth = R.drawable.mouth
                    } else mouth = androidx.core.R.drawable.ic_call_decline

                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxEars,
                            onCheckedChange = { checkboxEars = it },
                        )
                        Text(text = "Ears")
                    }
                    if (checkboxEars == true) {

                        ears = R.drawable.ears
                    } else ears = androidx.core.R.drawable.ic_call_decline
                }
                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(modifier=Modifier
                        .width(200.dp),
                        horizontalArrangement = Arrangement.Absolute.Left,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkboxShoes,
                            onCheckedChange = { checkboxShoes = it },
                        )
                        Text(text = "Shoes")
                    }
                    if (checkboxShoes == true) {

                        shoes = R.drawable.shoes
                    } else shoes = androidx.core.R.drawable.ic_call_decline
                }
            }
        }
    }
}

fun onStateChange(onStateChange: Boolean) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PotatoeHeadTheme {
        Greeting("Android")
    }
}