package com.example.tictac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Game extends AppCompatActivity {
    int turn =2;
    int bool[]= {0,0,0,0,0,0,0,0,0};
    int p1Won[] = {0,0,0,0,0,0,0,0,0};
    int p2Won[] = {0,0,0,0,0,0,0,0,0};
    int i=0,j=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
    public void a1_turn(View v){

        if(bool[0]==0){
        TextView a1 = findViewById(R.id.a1_btn);

            if (turn % 2 == 0) {
                a1.setText("X");
                turn++;
                bool[0]=1;
                p1Won[0]=1;

                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){

                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();



                }

            } else {
                a1.setText("O");
                turn++;
                bool[0]=1;
                p2Won[0]=1;
                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){

                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){

                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }

            }}

    }
    public void a2_turn(View v){
        if(bool[1]==0){
        TextView a2 = findViewById(R.id.a2_btn);
            if(turn%2==0) {
            a2.setText("X");
            turn++;
            bool[1]=1;
                p1Won[1]=1;
                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }
            else{
            a2.setText("O");
            turn++;
                bool[1]=1;
                p2Won[1]=1;
                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }}else{}

    }
    public void a3_turn(View v) {
        if (bool[2] == 0) {
            TextView a3 = findViewById(R.id.a3_btn);
            if (turn % 2 == 0) {
                a3.setText("X");
                turn++;
                bool[2] = 1;
                p1Won[2]=1;
                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            } else {
                a3.setText("O");
                turn++;
                bool[2] = 1;
                p2Won[2]=1;
                int result1 = p1Win();
                int result2 = p2Win();
                if(result1==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 1 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else if(result2==1){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                    builder.setMessage("Player 2 has won!");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }
        } else {
        }
    }


    public void b1_turn(View v){
        if (bool[3] == 0) {
        TextView b1 = findViewById(R.id.b1_btn);
               if (turn % 2 == 0) {
                b1.setText("X");
                turn++;
                bool[3]=1;
                   p1Won[3]=1;
                   int result1 = p1Win();
                   int result2 = p2Win();
                   if(result1==1){
                       AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                       builder.setMessage("Player 1 has won!");
                       builder.setCancelable(false);
                       builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                               dialog.cancel();
                           }
                       });
                       AlertDialog alertDialog = builder.create();
                       alertDialog.show();

                   }
                   else if(result2==1){
                       AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                       builder.setMessage("Player 2 has won!");
                       builder.setCancelable(false);
                       builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                               dialog.cancel();
                           }
                       });
                       AlertDialog alertDialog = builder.create();
                       alertDialog.show();
                   }
            } else {
                b1.setText("O");
                turn++;
                   bool[3]=1;
                   p2Won[3]=1;
                   int result1 = p1Win();
                   int result2 = p2Win();
                   if(result1==1){
                       AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                       builder.setMessage("Player 1 has won!");
                       builder.setCancelable(false);
                       builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                               dialog.cancel();
                           }
                       });
                       AlertDialog alertDialog = builder.create();
                       alertDialog.show();
                   }
                   else if(result2==1){
                       AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                       builder.setMessage("Player 2 has won!");
                       builder.setCancelable(false);
                       builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {

                               dialog.cancel();
                           }
                       });
                       AlertDialog alertDialog = builder.create();
                       alertDialog.show();
                   }

            }}
        else{}

    }
    public void b2_turn(View v){
        if(bool[4]==0){
        TextView b2 = findViewById(R.id.b2_btn);
        if(turn%2==0) {
            b2.setText("X");
            turn++;
            bool[4]=1;
            p1Won[4]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
        else{
            b2.setText("O");
            turn++;
            bool[4]=1;
            p2Won[4]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }}
        else{}
    }
    public void b3_turn(View v){
       if(bool[5]==0){
           TextView b3 = findViewById(R.id.b3_btn);
           if(turn%2==0){
               b3.setText("X");
               turn++;
               bool[5]=1;
               p1Won[5]=1;
               int result1 = p1Win();
               int result2 = p2Win();
               if(result1==1){
                   AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                   builder.setMessage("Player 1 has won!");
                   builder.setCancelable(false);
                   builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           dialog.cancel();
                       }
                   });
                   AlertDialog alertDialog = builder.create();
                   alertDialog.show();
               }
               else if(result2==1){
                   AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                   builder.setMessage("Player 2 has won!");
                   builder.setCancelable(false);
                   builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           dialog.cancel();
                       }
                   });
                   AlertDialog alertDialog = builder.create();
                   alertDialog.show();
               }
           }
               else {
                   b3.setText("O");
                   turn++;
                   bool[5]=1;
               p2Won[5]=1;
               int result1 = p1Win();
               int result2 = p2Win();
               if(result1==1){
                   AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                   builder.setMessage("Player 1 has won!");
                   builder.setCancelable(false);
                   builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           dialog.cancel();
                       }
                   });
                   AlertDialog alertDialog = builder.create();
                   alertDialog.show();
               }
               else if(result2==1){
                   AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                   builder.setMessage("Player 2 has won!");
                   builder.setCancelable(false);
                   builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {

                           dialog.cancel();
                       }
                   });
                   AlertDialog alertDialog = builder.create();
                   alertDialog.show();
               }
           } }
               else{}

       }


    public void c1_turn(View v){
        if(bool[6]==0){
        TextView c1 = findViewById(R.id.c1_btn);
        if(turn%2==0) {
            c1.setText("X");
            turn++;
            bool[6]=1;
            p1Won[6]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
        else{
            c1.setText("O");
            turn++;
            bool[6]=1;
            p2Won[6]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        }}
        else{}
    }
    public void c2_turn(View v){
        if(bool[7]==0){
        TextView c2 = findViewById(R.id.c2_btn);
        if(turn%2==0) {
        c2.setText("X");
        turn++;
        bool[7]=1;
            p1Won[7]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }}
        else{
            c2.setText("O");
            turn++;
            bool[7]=1;
            p2Won[7]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

        }}
        else{}
    }
    public void c3_turn(View v){
        if(bool[8]==0){
        TextView c3 = findViewById(R.id.c3_btn);
        if(turn%2==0) {
            c3.setText("X");
            turn++;
            bool[8]=1;
            p1Won[8]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }
        else{
            c3.setText("O");
            turn++;
            bool[8]=1;
            p2Won[8]=1;
            int result1 = p1Win();
            int result2 = p2Win();
            if(result1==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 1 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            else if(result2==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                builder.setMessage("Player 2 has won!");
                builder.setCancelable(false);
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }}
        else{}
    }

        int p1Win(){
        if(p1Won[0]==1&&p1Won[1]==1&&p1Won[2]==1){
            return 1;

        }if(p1Won[3]==1&&p1Won[4]==1&&p1Won[5]==1){
                return 1;
        }
        if(p1Won[6]==1&&p1Won[7]==1&&p1Won[8]==1){
                return 1;
        }
        if(p1Won[0]==1&&p1Won[3]==1&&p1Won[6]==1){
                return 1;
        }
        if(p1Won[1]==1&&p1Won[4]==1&&p1Won[7]==1){
                return 1;
        }
        if(p1Won[2]==1&&p1Won[5]==1&&p1Won[8]==1){
                return 1;
        }
        if(p1Won[0]==1&&p1Won[4]==1&&p1Won[8]==1){
                return 1;
        }
        if(p1Won[2]==1&&p1Won[4]==1&&p1Won[6]==1){
                return 1;
        }
        return 0;
        }
        int p2Win(){
            if(p2Won[0]==1&&p2Won[1]==1&&p2Won[2]==1){
                return 1;

            }if(p2Won[3]==1&&p2Won[4]==1&&p2Won[5]==1){
                return 1;
            }
            if(p2Won[6]==1&&p2Won[7]==1&&p2Won[8]==1){
                return 1;
            }
            if(p2Won[0]==1&&p2Won[3]==1&&p2Won[6]==1){
                return 1;
            }
            if(p2Won[1]==1&&p2Won[4]==1&&p2Won[7]==1){
                return 1;
            }
            if(p2Won[2]==1&&p2Won[5]==1&&p2Won[8]==1){
                return 1;
            }
            if(p2Won[0]==1&&p2Won[4]==1&&p2Won[8]==1){
                return 1;
            }
            if(p2Won[2]==1&&p2Won[4]==1&&p2Won[6]==1){
                return 1;
            }
            return 0;
        }
     public void Reset(View v) {
         TextView a1_btn = findViewById(R.id.a1_btn);
         TextView b1_btn = findViewById(R.id.b1_btn);
         TextView a2_btn = findViewById(R.id.a2_btn);
         TextView b2_btn = findViewById(R.id.b2_btn);
         TextView a3_btn = findViewById(R.id.a3_btn);
         TextView b3_btn = findViewById(R.id.b3_btn);
         TextView c2_btn = findViewById(R.id.c2_btn);
         TextView c1_btn = findViewById(R.id.c1_btn);
         TextView c3_btn = findViewById(R.id.c3_btn);

         a1_btn.setText("");
         a2_btn.setText("");
         a3_btn.setText("");
         b1_btn.setText("");
         b2_btn.setText("");
         b3_btn.setText("");
         c1_btn.setText("");
         c2_btn.setText("");
         c3_btn.setText("");

         for(int k=0;k<9;k++){
             bool[k]=0;
             p1Won[k]=0;
             p2Won[k]=0;
         }

     }



}
