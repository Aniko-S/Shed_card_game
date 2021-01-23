import React from 'react';
const cardImages = require.context('./cards');

function Card({ id, className }) {
  const imageFileName = () => {
    return id + '.png';
  };
  return (
    <img className={`card ${className}`} src={cardImages(`./${imageFileName()}`).default} alt={imageFileName()} />
  );
}

export default Card;
