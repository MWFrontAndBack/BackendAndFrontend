import React, { useState } from 'react';
import useSound from 'use-sound';
// import './sound.css'
import drose from '../assets/sounds/drose.mp3';
import fragile from '../assets/sounds/fragile.mp3';
import guccigang from '../assets/sounds/guccigang.mp3';
import hoodgocrazy from '../assets/sounds/hoodgocrazy.mp3';
import loseyourself from '../assets/sounds/loseyourself.mp3';
import lovetheyoulielyrics from '../assets/sounds/lovetheyoulielyrics.mp3';
import mowilas from '../assets/sounds/mowilas.mp3';
import rolex from '../assets/sounds/rolex.mp3';
import rollinginthedeep from '../assets/sounds/rollinginthedeep.mp3';
import someonelikeyou from '../assets/sounds/someonelikeyou.mp3';


function MyButton(props) {
    const songPath = props.path;
    console.log(songPath);

    const songMap = {

        '../assets/sounds/drose.mp3': drose,
        '../assets/sounds/fragile.mp3': fragile,
        '../assets/sounds/guccigang.mp3': guccigang,
        '../assets/sounds/hoodgocrazy.mp3': hoodgocrazy,
        '../assets/sounds/loseyourself.mp3': loseyourself,
        '../assets/sounds/lovetheyoulielyrics.mp3': lovetheyoulielyrics,
        '../assets/sounds/mowilas.mp3': mowilas,
        '../assets/sounds/rollinginthedeep.mp3': rollinginthedeep,
        '../assets/sounds/someonelikeyou.mp3': someonelikeyou,
        '../assets/sounds/rolex.mp3': rolex
    };
    const selectedSong = songMap[songPath];

    const [playSound, { stop }] = useSound(selectedSong);
    const [isPlaying, setIsPlaying] = useState(false);

    function handlePlay() {
        playSound();
        setIsPlaying(true);
    }

    function handleStop() {
        stop();
        setIsPlaying(false);
    }

    return (
        <div className='center'>
            {isPlaying ? (
                <button className='my-button' onClick={handleStop}>

                    <svg xmlns="http://www.w3.org/2000/svg" width="200" height="50" fill="currentColor" class="bi bi-sign-stop" viewBox="0 0 16 16">
                        <path d="M3.16 10.08c-.931 0-1.447-.493-1.494-1.132h.653c.065.346.396.583.891.583.524 0 .83-.246.83-.62 0-.303-.203-.467-.637-.572l-.656-.164c-.61-.147-.978-.51-.978-1.078 0-.706.597-1.184 1.444-1.184.853 0 1.386.475 1.436 1.087h-.645c-.064-.32-.352-.542-.797-.542-.472 0-.77.246-.77.6 0 .261.196.437.553.522l.654.161c.673.164 1.06.487 1.06 1.11 0 .736-.574 1.228-1.544 1.228Zm3.427-3.51V10h-.665V6.57H4.753V6h3.006v.568H6.587Z" />
                        <path fill-rule="evenodd" d="M11.045 7.73v.544c0 1.131-.636 1.805-1.661 1.805-1.026 0-1.664-.674-1.664-1.805V7.73c0-1.136.638-1.807 1.664-1.807 1.025 0 1.66.674 1.66 1.807Zm-.674.547v-.553c0-.827-.422-1.234-.987-1.234-.572 0-.99.407-.99 1.234v.553c0 .83.418 1.237.99 1.237.565 0 .987-.408.987-1.237Zm1.15-2.276h1.535c.82 0 1.316.55 1.316 1.292 0 .747-.501 1.289-1.321 1.289h-.865V10h-.665V6.001Zm1.436 2.036c.463 0 .735-.272.735-.744s-.272-.741-.735-.741h-.774v1.485h.774Z" />
                        <path fill-rule="evenodd" d="M4.893 0a.5.5 0 0 0-.353.146L.146 4.54A.5.5 0 0 0 0 4.893v6.214a.5.5 0 0 0 .146.353l4.394 4.394a.5.5 0 0 0 .353.146h6.214a.5.5 0 0 0 .353-.146l4.394-4.394a.5.5 0 0 0 .146-.353V4.893a.5.5 0 0 0-.146-.353L11.46.146A.5.5 0 0 0 11.107 0H4.893ZM1 5.1 5.1 1h5.8L15 5.1v5.8L10.9 15H5.1L1 10.9V5.1Z" />
                    </svg></button>
            ) : (
                <button className='my-button' onClick={handlePlay}>
                    <svg xmlns="http://www.w3.org/2000/svg" width="200" height="50" fill="currentColor" class="bi bi-play-circle-fill" viewBox="0 0 16 16">
                        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zM6.79 5.093A.5.5 0 0 0 6 5.5v5a.5.5 0 0 0 .79.407l3.5-2.5a.5.5 0 0 0 0-.814l-3.5-2.5z" />
                    </svg>
                </button>
            )}
        </div>
    );
}

export { MyButton };
