package com.example.quoetsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuoetsActivity extends AppCompatActivity {



    TextView txtTitle;
    RecyclerView rcv;



//    int img[]={R.drawable.bg2,R.drawable.happybg,};

    ArrayList<ModalClassQuetes> quoteslist = new ArrayList<>();

    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quoets);
        initview();
    }

    private void initview() {

        rcv = findViewById(R.id.rcv);
        txtTitle = findViewById(R.id.txtTitle);


        if(getIntent()!=null)
        {
            title = getIntent().getStringExtra("catrgory");
            txtTitle.setText(title);


            if(title.equals("Happy"))
            {
                ModalClassQuetes  m1 = new ModalClassQuetes();
                m1.setQuoets("The purpose of our lives is to be happy.");
                quoteslist.add(m1);

                ModalClassQuetes  m2 = new ModalClassQuetes();
                m2.setQuoets("Life is what happens when you're busy making other plans.");
                quoteslist.add(m2);

                ModalClassQuetes  m3 = new ModalClassQuetes();
                m3.setQuoets("Get busy living or get busy dying.");
                quoteslist.add(m3);


                ModalClassQuetes  m4 = new ModalClassQuetes();
                m4.setQuoets("You only live once, but if you do it right, once is enough.");


                ModalClassQuetes  m5 = new ModalClassQuetes();
                m5.setQuoets("Many of life’s failures are people who did not realize how close they were to success when they gave up.");
                quoteslist.add(m5);


                ModalClassQuetes  m6 = new ModalClassQuetes();
                m6.setQuoets("If you want to live a happy life, tie it to a goal, not to people or things.");
                quoteslist.add(m6);


                ModalClassQuetes  m7 = new ModalClassQuetes();
                m7.setQuoets("Never let the fear of striking out keep you from playing the game.");
                quoteslist.add(m7);


                ModalClassQuetes  m8 = new ModalClassQuetes();
                m8.setQuoets("Money and success don’t change people; they merely amplify what is already there");
                quoteslist.add(m8);


                ModalClassQuetes  m9 = new ModalClassQuetes();
                m9.setQuoets("Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.");
                quoteslist.add(m9);


                ModalClassQuetes  m10 = new ModalClassQuetes();
                m10.setQuoets("Not how long, but how well you have lived is the main thing.");

                quoteslist.add(m10);


                ModalClassQuetes  m11 = new ModalClassQuetes();
                m11.setQuoets("If life were predictable it would cease to be life, and be without flavor.");
                quoteslist.add(m11);


                ModalClassQuetes  m12 = new ModalClassQuetes();
                m12.setQuoets("The whole secret of a successful life is to find out what is one’s destiny to do, and then do it.");
                quoteslist.add(m12);


                ModalClassQuetes  m13 = new ModalClassQuetes();
                m13.setQuoets("In order to write about life first you must live it.");
                quoteslist.add(m13);


                ModalClassQuetes  m14 = new ModalClassQuetes();
                m14.setQuoets("The big lesson in life, baby, is never be scared of anyone or anything.");
                quoteslist.add(m14);


                ModalClassQuetes  m15 = new ModalClassQuetes();
                m15.setQuoets("Curiosity about life in all of its aspects, I think, is still the secret of great creative people.");
                quoteslist.add(m15);
            }

            else if(title.equals("Sad"))
            {
                ModalClassQuetes  m1 = new ModalClassQuetes();
                m1.setQuoets("Sadness flies away on the wings of time.");
                quoteslist.add(m1);

                ModalClassQuetes  m2 = new ModalClassQuetes();
                m2.setQuoets("Don't cry over someone who wouldn't cry over you.");
                quoteslist.add(m2);

                ModalClassQuetes  m3 = new ModalClassQuetes();
                m3.setQuoets("Any fool can be happy. It takes a man with real heart to make beauty out of the stuff that makes us weep.");
                quoteslist.add(m3);


                ModalClassQuetes  m4 = new ModalClassQuetes();
                m4.setQuoets("We must understand that sadness is an ocean, and sometimes we drown, while other days we are forced to swim.");
                quoteslist.add(m4);


                ModalClassQuetes  m5 = new ModalClassQuetes();
                m5.setQuoets("The word ‘happy’ would lose its meaning if it were not balanced by sadness.");
                quoteslist.add(m5);


                ModalClassQuetes  m6 = new ModalClassQuetes();
                m6.setQuoets("Tears are words that need to be written.");
                quoteslist.add(m6);


                ModalClassQuetes  m7 = new ModalClassQuetes();
                m7.setQuoets("Sadness is but a wall between two gardens.");
                quoteslist.add(m7);


                ModalClassQuetes  m8 = new ModalClassQuetes();
                m8.setQuoets("Sadness is but a wall between two gardens.");
                quoteslist.add(m8);


                ModalClassQuetes  m9 = new ModalClassQuetes();
                m9.setQuoets("Sadness is also a kind of defense.");
                quoteslist.add(m9);


                ModalClassQuetes  m10 = new ModalClassQuetes();
                m10.setQuoets("The walls we build around us to keep sadness out also keeps out the joy.");
                quoteslist.add(m10);


                ModalClassQuetes  m11 = new ModalClassQuetes();
                m11.setQuoets("Experiencing sadness and anger can make you feel more creative, and by being creative you can get beyond your pain or negativity.");
                quoteslist.add(m11);


                ModalClassQuetes  m12 = new ModalClassQuetes();
                m12.setQuoets("Sad hurts but it's a healthy feeling. It is a necessary thing to feel.");
                quoteslist.add(m12);


                ModalClassQuetes  m13 = new ModalClassQuetes();
                m13.setQuoets("Experiencing sadness and anger can make you feel more creative, and by being creative you can get beyond your pain or negativity.");
                quoteslist.add(m13);


                ModalClassQuetes  m14 = new ModalClassQuetes();
                m14.setQuoets("There are two types of people in the world: Those who prefer to be sad among others, and those who prefer to be sad alone");
                quoteslist.add(m14);


                ModalClassQuetes  m15 = new ModalClassQuetes();
                m15.setQuoets("It is sad not to love, but it is much sadder not to be able to love");
                quoteslist.add(m15);
            }


            else if(title.equals("Attitude"))
            {

                ModalClassQuetes  m1 = new ModalClassQuetes();
                m1.setQuoets("I don’t think of all the misery but of the beauty that still remains.");
                quoteslist.add(m1);

                ModalClassQuetes  m2 = new ModalClassQuetes();
                m2.setQuoets("Optimism is the faith that leads to achievement; nothing can be done without hope.");
                quoteslist.add(m2);

                ModalClassQuetes  m3 = new ModalClassQuetes();
                m3.setQuoets("Our future cannot depend on the government alone. The ultimate solutions lie in the attitudes and the actions of the American people.");
                quoteslist.add(m3);


                ModalClassQuetes  m4 = new ModalClassQuetes();
                m4.setQuoets("When a happy person comes into the room, it is as if another candle has been lit.");
                quoteslist.add(m4);


                ModalClassQuetes  m5 = new ModalClassQuetes();
                m5.setQuoets("Take the attitude of a student, never be too big to ask questions, never know too much to learn something new.");
                quoteslist.add(m5);


                ModalClassQuetes  m6 = new ModalClassQuetes();
                m6.setQuoets("You can often change your circumstances by changing your attitude.");
                quoteslist.add(m6);


                ModalClassQuetes  m7 = new ModalClassQuetes();
                m7.setQuoets("Attitude and enthusiasm play a big part in my life. I get excited about the things that inspire me. I also believe in laughing and having a good time.");
                quoteslist.add(m7);


                ModalClassQuetes  m8 = new ModalClassQuetes();
                m8.setQuoets("Be positive. Your mind is more powerful than you think. What is down in the well comes up in the bucket. Fill yourself with positive things.");
                quoteslist.add(m8);


                ModalClassQuetes  m9 = new ModalClassQuetes();
                m9.setQuoets("Always bear in mind that your own resolution to succeed is more important than any other one thing.");
                quoteslist.add(m9);


                ModalClassQuetes  m10 = new ModalClassQuetes();
                m10.setQuoets("Optimism is a happiness magnet. If you stay positive, good things and good people will be drawn to you.");
                quoteslist.add(m10);


                ModalClassQuetes  m11 = new ModalClassQuetes();
                m11.setQuoets("To be a great champion you must believe you are the best. If you’re not, pretend you are.");
                quoteslist.add(m11);


                ModalClassQuetes  m12 = new ModalClassQuetes();
                m12.setQuoets("You always pass failure on the way to success.");
                quoteslist.add(m12);


                ModalClassQuetes  m13 = new ModalClassQuetes();
                m13.setQuoets("Keep your face always toward the sunshine—and shadows will fall behind you.");
                quoteslist.add(m13);


                ModalClassQuetes  m14 = new ModalClassQuetes();
                m14.setQuoets("I always like to look on the optimistic side of life, but I am realistic enough to know that life is a complex matter.");
                quoteslist.add(m14);


                ModalClassQuetes  m15 = new ModalClassQuetes();
                m15.setQuoets("Perpetual optimism is a force multiplier.");
                quoteslist.add(m15);

            }

            else if(title.equals("Angry"))
            {

                ModalClassQuetes  m1 = new ModalClassQuetes();
                m1.setQuoets("My existence is for myself; I do not exist to impress others,");
                quoteslist.add(m1);

                ModalClassQuetes  m2 = new ModalClassQuetes();
                m2.setQuoets("I am angry; it is a feeling that makes your tongue work faster than the brain.");
                quoteslist.add(m2);

                ModalClassQuetes  m3 = new ModalClassQuetes();
                m3.setQuoets("The best way to get someone’s attention is to stop giving them your attention.");
                quoteslist.add(m3);


                ModalClassQuetes  m4 = new ModalClassQuetes();
                m4.setQuoets("Life is short, don’t waste it on me.");
                quoteslist.add(m4);


                ModalClassQuetes  m5 = new ModalClassQuetes();
                m5.setQuoets("You lose your importance in their life when you give lots of importance to them. .");
                quoteslist.add(m5);


                ModalClassQuetes  m6 = new ModalClassQuetes();
                m6.setQuoets("My attitude replies to you if your ego speaks with me.");
                quoteslist.add(m6);


                ModalClassQuetes  m7 = new ModalClassQuetes();
                m7.setQuoets("Quit talking to me if you don’t like my attitude.");
                quoteslist.add(m7);


                ModalClassQuetes  m8 = new ModalClassQuetes();
                m8.setQuoets("You do not need to explain, I know who I am,");
                quoteslist.add(m8);


                ModalClassQuetes  m9 = new ModalClassQuetes();
                m9.setQuoets("I’ll leave you like a choice if you treat me like an option.");
                quoteslist.add(m9);


                ModalClassQuetes  m10 = new ModalClassQuetes();
                m10.setQuoets("My life, my attitude");
                quoteslist.add(m10);


                ModalClassQuetes  m11 = new ModalClassQuetes();
                m11.setQuoets("Maybe I am not perfect, but I am always me.");
                quoteslist.add(m11);


                ModalClassQuetes  m12 = new ModalClassQuetes();
                m12.setQuoets("Make sure that you are perfect if you are going to judge me.");
                quoteslist.add(m12);


                ModalClassQuetes  m13 = new ModalClassQuetes();
                m13.setQuoets("I’m not a WhatsApp status; I don’t mind if you don’t like me.");
                quoteslist.add(m13);


                ModalClassQuetes  m14 = new ModalClassQuetes();
                m14.setQuoets("Think before you talk; even when you are mad, the words you say can only be forgiven but not forgettable.");
                quoteslist.add(m14);


                ModalClassQuetes  m15 = new ModalClassQuetes();
                m15.setQuoets("Hey you! I found something under my shoes; oh, it’s your fucking attitude.");
                quoteslist.add(m15);

            }

            else if(title.equals("Friendship"))
            {

                ModalClassQuetes  m1 = new ModalClassQuetes();
                m1.setQuoets("Friendship is the hardest thing in the world to explain. It’s not something you learn in school. But if you haven’t learned the meaning of friendship, you really haven’t learned anything.” ");
                quoteslist.add(m1);

                ModalClassQuetes  m2 = new ModalClassQuetes();
                m2.setQuoets("Don’t make friends who are comfortable to be with. Make friends who will force you to lever yourself up.");
                quoteslist.add(m2);

                ModalClassQuetes  m3 = new ModalClassQuetes();
                m3.setQuoets("The most beautiful discovery true friends make is that they can grow separately without growing apart.");
                quoteslist.add(m3);


                ModalClassQuetes  m4 = new ModalClassQuetes();
                m4.setQuoets("Each friend represents a world in us, a world possibly not born until they arrive, and it is only by this meeting that a new world is born.");
                quoteslist.add(m4);


                ModalClassQuetes  m5 = new ModalClassQuetes();
                m5.setQuoets("Find a group of people who challenge and inspire you; spend a lot of time with them, and it will change your life.");
                quoteslist.add(m5);


                ModalClassQuetes  m6 = new ModalClassQuetes();
                m6.setQuoets("They may forget what you said, but they will never forget how you made them feel.");
                quoteslist.add(m6);


                ModalClassQuetes  m7 = new ModalClassQuetes();
                m7.setQuoets("For beautiful eyes, look for the good in others; for beautiful lips, speak only words of kindness; and for poise, walk with the knowledge that you are never alone.");
                quoteslist.add(m7);


                ModalClassQuetes  m8 = new ModalClassQuetes();
                m8.setQuoets("Happiness can be found even in the darkest of times, if one only remembers to turn on the light.");
                quoteslist.add(m8);


                ModalClassQuetes  m9 = new ModalClassQuetes();
                m9.setQuoets("A real friend is one who walks in when the rest of the world walks out.");
                quoteslist.add(m9);


                ModalClassQuetes  m10 = new ModalClassQuetes();
                m10.setQuoets("A friend is someone who understands your past, believes in your future, and accepts you just the way you are.");
                quoteslist.add(m10);


                ModalClassQuetes  m11 = new ModalClassQuetes();
                m11.setQuoets("Growing apart doesn’t change the fact that for a long time we grew side by side; our roots will always be tangled. I’m glad for that.");
                quoteslist.add(m11);


                ModalClassQuetes  m12 = new ModalClassQuetes();
                m12.setQuoets("Let us be grateful to the people who make us happy; they are the charming gardeners who make our souls blossom.");
                quoteslist.add(m12);


                ModalClassQuetes  m13 = new ModalClassQuetes();
                m13.setQuoets("Lots of people want to ride with you in the limo, but what you want is someone who will take the bus with you when the limo breaks down.");
                quoteslist.add(m13);


                ModalClassQuetes  m14 = new ModalClassQuetes();
                m14.setQuoets("In the sweetness of friendship let there be laughter, for in the dew of little things the heart finds its morning and is refreshed.");
                quoteslist.add(m14);


                ModalClassQuetes  m15 = new ModalClassQuetes();
                m15.setQuoets("It’s not what we have in life, but who we have in our life that matters.");
                quoteslist.add(m15);

            }

        else if(title.equals("Love"))
        {

            ModalClassQuetes  m1 = new ModalClassQuetes();
            m1.setQuoets("As he read, I fell in love the way you fall asleep: slowly, and then all at once.");
            quoteslist.add(m1);

            ModalClassQuetes  m2 = new ModalClassQuetes();
            m2.setQuoets("Loved you yesterday, love you still, always have, always will.");
            quoteslist.add(m2);

            ModalClassQuetes  m3 = new ModalClassQuetes();
            m3.setQuoets("I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.");
            quoteslist.add(m3);


            ModalClassQuetes  m4 = new ModalClassQuetes();
            m4.setQuoets("I love you not only for what you are, but for what I am when I am with you. I love you not only for what you have made of yourself, but for what you are making of me. I love you for the part of me that you bring out.");
            quoteslist.add(m4);


            ModalClassQuetes  m5 = new ModalClassQuetes();
            m5.setQuoets("The real lover is a man who can thrill you by kissing your forehead or smiling into your eyes or just staring into space.");
            quoteslist.add(m5);


            ModalClassQuetes  m6 = new ModalClassQuetes();
            m6.setQuoets("In all the world, there is no heart for me like yours. In all the world, there is no love for you like mine.");
            quoteslist.add(m6);


            ModalClassQuetes  m7 = new ModalClassQuetes();
            m7.setQuoets("I’ll be loving you, always with a love that’s true");
            quoteslist.add(m7);


            ModalClassQuetes  m8 = new ModalClassQuetes();
            m8.setQuoets("Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.");
            quoteslist.add(m8);


            ModalClassQuetes  m9 = new ModalClassQuetes();
            m9.setQuoets("I need you like a heart needs a beat.");
            quoteslist.add(m9);


            ModalClassQuetes  m10 = new ModalClassQuetes();
            m10.setQuoets("If I know what love is, it is because of you.");
            quoteslist.add(m10);


            ModalClassQuetes  m11 = new ModalClassQuetes();
            m11.setQuoets("I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.");
            quoteslist.add(m11);


            ModalClassQuetes  m12 = new ModalClassQuetes();
            m12.setQuoets("If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.");
            quoteslist.add(m12);


            ModalClassQuetes  m13 = new ModalClassQuetes();
            m13.setQuoets("A man is already halfway in love with any woman who listens to him.");
            quoteslist.add(m13);


            ModalClassQuetes  m14 = new ModalClassQuetes();
            m14.setQuoets("I love you as certain dark things are to be loved, in secret, between the shadow and the soul.");
            quoteslist.add(m14);


            ModalClassQuetes  m15 = new ModalClassQuetes();
            m15.setQuoets("You make me want to be a better man.");
            quoteslist.add(m15);

        }

        else  if(title.equals("Motivational"))
        {

            ModalClassQuetes  m1 = new ModalClassQuetes();
            m1.setQuoets("Where can we find the courage to act in spite of fear? Trying to eliminate that which we react to fearfully is a fool’s errand because it locates the source of our fear outside ourselves, rather than within our own hearts.");
            quoteslist.add(m1);

            ModalClassQuetes  m2 = new ModalClassQuetes();
            m2.setQuoets("Practicing leadership – enabling others to achieve purpose in the face of uncertainty – requires engaging the heart, the head, and the hands: motivation, strategy, and action.");
            quoteslist.add(m2);

            ModalClassQuetes  m3 = new ModalClassQuetes();
            m3.setQuoets("First forget inspiration. Habit is more dependable. Habit will sustain you whether you're inspired or not. Habit will help you finish and polish your stories. Inspiration won't. Habit is persistence in practice.");
            quoteslist.add(m3);


            ModalClassQuetes  m4 = new ModalClassQuetes();
            m4.setQuoets("Someone will declare, “I am the leader!” and expect everyone to get in line and follow him or her to the gates of heaven or hell. My experience is that it doesn’t happen that way. Others follow you based on the quality of your actions rather than the magnitude of your declarations.");
            quoteslist.add(m4);


            ModalClassQuetes  m5 = new ModalClassQuetes();
            m5.setQuoets("Inspiration does exist, but it must find you working.");
            quoteslist.add(m5);


            ModalClassQuetes  m6 = new ModalClassQuetes();
            m6.setQuoets("Don't settle for average. Bring your best to the moment. Then, whether it fails or succeeds, at least you know you gave all you had.");
            quoteslist.add(m6);


            ModalClassQuetes  m7 = new ModalClassQuetes();
            m7.setQuoets("Show up, show up, show up, and after a while the muse shows up, too.");
            quoteslist.add(m7);


            ModalClassQuetes  m8 = new ModalClassQuetes();
            m8.setQuoets("Don't bunt. Aim out of the ballpark. Aim for the company of immortals.");
            quoteslist.add(m8);


            ModalClassQuetes  m9 = new ModalClassQuetes();
            m9.setQuoets("I have stood on a mountain of no’s for one yes.");
            quoteslist.add(m9);


            ModalClassQuetes  m10 = new ModalClassQuetes();
            m10.setQuoets("If you believe something needs to exist, if it's something you want to use yourself, don't let anyone ever stop you from doing it");
            quoteslist.add(m10);


            ModalClassQuetes  m11 = new ModalClassQuetes();
            m11.setQuoets("First forget inspiration. Habit is more dependable. Habit will sustain you whether you're inspired or not. Habit will help you finish and polish your stories. Inspiration won't. Habit is persistence in practice.");
            quoteslist.add(m11);


            ModalClassQuetes  m12 = new ModalClassQuetes();
            m12.setQuoets("The best way out is always through.");
            quoteslist.add(m12);


            ModalClassQuetes  m13 = new ModalClassQuetes();
            m13.setQuoets("The battles that count aren't the ones for gold medals. The struggles within yourself—the invisible, inevitable battles inside all of us—that's where it's at.");
            quoteslist.add(m13);


            ModalClassQuetes  m14 = new ModalClassQuetes();
            m14.setQuoets("If there is no struggle, there is no progress.");
            quoteslist.add(m14);


            ModalClassQuetes  m15 = new ModalClassQuetes();
            m15.setQuoets("Courage is like a muscle. We strengthen it by use.");
            quoteslist.add(m15);

        }

        else if(title.equals("Alone"))
        {

            ModalClassQuetes  m1 = new ModalClassQuetes();
            m1.setQuoets("It’s far better to be unhappy alone than unhappy with someone — so far.");
            quoteslist.add(m1);

            ModalClassQuetes  m2 = new ModalClassQuetes();
            m2.setQuoets("Laugh and the world laughs with you, snore and you sleep alone.");
            quoteslist.add(m2);

            ModalClassQuetes  m3 = new ModalClassQuetes();
            m3.setQuoets("It’s easy to stand with the crowd it takes courage to stand alone");
            quoteslist.add(m3);


            ModalClassQuetes  m4 = new ModalClassQuetes();
            m4.setQuoets("I used to think the worst thing in life was to end up all alone, it’s not. The worst thing in life is to end up with people that make you feel all alone.");
            quoteslist.add(m4);


            ModalClassQuetes  m5 = new ModalClassQuetes();
            m5.setQuoets("Sometimes, you need to be alone. Not to be lonely, but to enjoy your free time being yourself.");
            quoteslist.add(m5);


            ModalClassQuetes  m6 = new ModalClassQuetes();
            m6.setQuoets("You smile, but you wanna cry. You talk, but you wanna be quiet. You pretend like you’re happy, but you aren’t.”");
            quoteslist.add(m6);


            ModalClassQuetes  m7 = new ModalClassQuetes();
            m7.setQuoets("Sometimes, you just need a break. In a beautiful place. Alone. To figure everything out.");
            quoteslist.add(m7);


            ModalClassQuetes  m8 = new ModalClassQuetes();
            m8.setQuoets("What a lovely surprise to finally discover how unlonely being alone can be.");
            quoteslist.add(m8);


            ModalClassQuetes  m9 = new ModalClassQuetes();
            m9.setQuoets("As I get older I’m more and more comfortable being alone.");
            quoteslist.add(m9);


            ModalClassQuetes  m10 = new ModalClassQuetes();
            m10.setQuoets("Loneliness adds beauty to life. It puts a special burn on sunsets and makes night air smell better.");
            quoteslist.add(m10);


            ModalClassQuetes  m11 = new ModalClassQuetes();
            m11.setQuoets("Once you start loving your own presence, you stop chasing people in your life.");
            quoteslist.add(m11);


            ModalClassQuetes  m12 = new ModalClassQuetes();
            m12.setQuoets("Sometimes you just need to be alone and let your tears out.");
            quoteslist.add(m12);


            ModalClassQuetes  m13 = new ModalClassQuetes();
            m13.setQuoets("The soul that sees beauty may sometimes walk alone.");
            quoteslist.add(m13);


            ModalClassQuetes  m14 = new ModalClassQuetes();
            m14.setQuoets("I live in that solitude which is painful in youth, but delicious in the years of maturity");
            quoteslist.add(m14);


            ModalClassQuetes  m15 = new ModalClassQuetes();
            m15.setQuoets("Nothing can bring you peace but yourself.");
            quoteslist.add(m15);

        }

        else if(title.equals("Best"))
        {

            ModalClassQuetes  m1 = new ModalClassQuetes();
            m1.setQuoets("I believe we are here on the planet Earth to live, grow up and do what we can to make this world a better place for all people to enjoy freedom.");
            quoteslist.add(m1);

            ModalClassQuetes  m2 = new ModalClassQuetes();
            m2.setQuoets("To love oneself is the beginning of a lifelong romance.");
            quoteslist.add(m2);

            ModalClassQuetes  m3 = new ModalClassQuetes();
            m3.setQuoets("Sometimes the most important thing in a whole day is the rest we take between two deep breaths.");
            quoteslist.add(m3);


            ModalClassQuetes  m4 = new ModalClassQuetes();
            m4.setQuoets("Almost everything will work again if you unplug it for a few minutes, including you.");
            quoteslist.add(m4);


            ModalClassQuetes  m5 = new ModalClassQuetes();
            m5.setQuoets("Knowing how to be solitary is central to the art of loving. When we can be alone, we can be with others without using them as a means of escape");
            quoteslist.add(m5);


            ModalClassQuetes  m6 = new ModalClassQuetes();
            m6.setQuoets("Time you enjoy wasting is not wasted time.\"");
            quoteslist.add(m6);


            ModalClassQuetes  m7 = new ModalClassQuetes();
            m7.setQuoets("Self-care is how you take your power back.");
            quoteslist.add(m7);


            ModalClassQuetes  m8 = new ModalClassQuetes();
            m8.setQuoets("You are the sum total of everything you've ever seen, heard, eaten, smelled, been told, forgot—it's all there. Everything influences each of us, and because of that I try to make sure that my experiences are positive.");
            quoteslist.add(m8);


            ModalClassQuetes  m9 = new ModalClassQuetes();
            m9.setQuoets("You are the sum total of everything you've ever seen, heard, eaten, smelled, been told, forgot—it's all there. Everything influences each of us, and because of that I try to make sure that my experiences are positive.");
            quoteslist.add(m9);


            ModalClassQuetes  m10 = new ModalClassQuetes();
            m10.setQuoets("Being a successful person is not necessarily defined by what you have achieved, but by what you have overcome.");
            quoteslist.add(m10);


            ModalClassQuetes  m11 = new ModalClassQuetes();
            m11.setQuoets("The events in our lives happen in a sequence in time, but in their significance to ourselves they find their own order the continuous thread of revelation.");
            quoteslist.add(m11);


            ModalClassQuetes  m12 = new ModalClassQuetes();
            m12.setQuoets("Life is not a spectator sport. If you're going to spend your whole life in the grandstand just watching what goes on, in my opinion you're wasting your life.");
            quoteslist.add(m12);


            ModalClassQuetes  m13 = new ModalClassQuetes();
            m13.setQuoets("The older you get, the more fragile you understand life to be. I think that's good motivation for getting out of bed joyfully each day.");
            quoteslist.add(m13);


            ModalClassQuetes  m14 = new ModalClassQuetes();
            m14.setQuoets("Real courage is doing the right thing when nobody's looking. Doing the unpopular thing because it's what you believe, and the heck with everybody.");
            quoteslist.add(m14);


            ModalClassQuetes  m15 = new ModalClassQuetes();
            m15.setQuoets("It's your life; you don't need someone's permission to live the life you want. Be brave to live from your heart.");
            quoteslist.add(m15);

        }

        else if(title.equals("Confidence"))
        {

            ModalClassQuetes  m1 = new ModalClassQuetes();
            m1.setQuoets("Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.");
            quoteslist.add(m1);

            ModalClassQuetes  m2 = new ModalClassQuetes();
            m2.setQuoets("You gain strength, courage, and confidence by every experience in which you really stop to look fear in the face. You are able to say to yourself, 'I have lived through this horror. I can take the next thing that comes along.' You must do the thing you think you cannot do.");
            quoteslist.add(m2);

            ModalClassQuetes  m3 = new ModalClassQuetes();
            m3.setQuoets("You probably wouldn’t worry about what people think of you if you could know how seldom they do.");
            quoteslist.add(m3);


            ModalClassQuetes  m4 = new ModalClassQuetes();
            m4.setQuoets("Remember that wherever your heart is, there you will find your treasure.");
            quoteslist.add(m4);


            ModalClassQuetes  m5 = new ModalClassQuetes();
            m5.setQuoets("Believe in your infinite potential. Your only limitations are those you set upon yourself.");
            quoteslist.add(m5);


            ModalClassQuetes  m6 = new ModalClassQuetes();
            m6.setQuoets("Accept who you are; and revel in it.");
            quoteslist.add(m6);


            ModalClassQuetes  m7 = new ModalClassQuetes();
            m7.setQuoets("The eyes of others our prisons; their thoughts our cages.");
            quoteslist.add(m7);


            ModalClassQuetes  m8 = new ModalClassQuetes();
            m8.setQuoets("When someone tells me \"no,\" it doesn't mean I can't do it, it simply means I can't do it with them.");
            quoteslist.add(m8);


            ModalClassQuetes  m9 = new ModalClassQuetes();
            m9.setQuoets("To share your weakness is to make yourself vulnerable; to make yourself vulnerable is to show your strength.");
            quoteslist.add(m9);


            ModalClassQuetes  m10 = new ModalClassQuetes();
            m10.setQuoets("Never dull your shine for somebody else.");
            quoteslist.add(m10);


            ModalClassQuetes  m11 = new ModalClassQuetes();
            m11.setQuoets("I do not care so much what I am to others as I care what I am to myself.");
            quoteslist.add(m11);


            ModalClassQuetes  m12 = new ModalClassQuetes();
            m12.setQuoets("What could we accomplish if we knew we could not fail?");
            quoteslist.add(m12);


            ModalClassQuetes  m13 = new ModalClassQuetes();
            m13.setQuoets("One of the greatest regrets in life is being what others would want you to be, rather than being yourself.");
            quoteslist.add(m13);


            ModalClassQuetes  m14 = new ModalClassQuetes();
            m14.setQuoets("I am only one, but I am one. I cannot do everything, but I can do something. And because I cannot do everything, I will not refuse to do the something that I can do.");
            quoteslist.add(m14);


            ModalClassQuetes  m15 = new ModalClassQuetes();
            m15.setQuoets("And no one will listen to us until we listen to ourselves.");
            quoteslist.add(m15);


        }



            QuotesInterface quotesInterface = new QuotesInterface() {
                @Override
                public void Clickcopy(String quoets) {


                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("label", quoets);
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(QuoetsActivity.this, "Copied ", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void Clickshare(String quoets) {

                    Intent sendIntent  = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                }
            };

            LinearLayoutManager manager = new LinearLayoutManager(QuoetsActivity.this,LinearLayoutManager.VERTICAL,false);
            rcv.setLayoutManager(manager);
            QuotesAdapter adapter = new QuotesAdapter(QuoetsActivity.this,quoteslist,quotesInterface);
            rcv.setAdapter(adapter);

        }


    }
}